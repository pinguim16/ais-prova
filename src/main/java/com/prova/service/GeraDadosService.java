package com.prova.service;

import com.prova.dto.FilmDTO;
import com.prova.mapper.FilmeMapper;
import com.prova.model.*;
import com.prova.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class GeraDadosService {

    private static final Logger log = LoggerFactory.getLogger(GeraDadosService.class);

    @Autowired
    private EmpresaProducaoRepository empresaProducaoRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private LinguaRepository linguaRepository;

    @Autowired
    private PaisProducaoRepository paisProducaoRepository;

    private static String URL = "https://api.themoviedb.org/3/movie/id_filme?api_key=b0c069b25ac6aea3b671a72da9b53b77&language=pt";

    /**
     * Método com funcionalidade de iniciar banco com dados
     */
    public void preencheBanco(){
        for(int i = 0; i < 1000; i++){
            try {
                this.getMovies(URL.replace("id_filme", String.valueOf(i)));
            }catch (Exception e){
                log.info("Filme não encontrado com id - {}", i);
            }
        }
    }


    /**
     * Processamento do filmes
     */
    public void getMovies(String url){
        RestTemplate restTemplate = new RestTemplate();
        log.info(url);
        FilmDTO filmDTO = restTemplate.getForObject(url, FilmDTO.class);

        Filme filme = FilmeMapper.INSTANCE.filmDTOToFilme(filmDTO);
        filme.setStatus(Status.getStatus(filmDTO.getStatus()));

        verificaLinguas(filme);
        verificaEmpresaProducaos(filme);
        verificaGeneros(filme);
        verificaPaisProducao(filme);

        Filme filmeSalvo = this.filmeRepository.findByIdExterno(filme.getIdExterno());
        if(filmeSalvo == null){
            this.filmeRepository.save(filme);
        }
    }

    private void verificaPaisProducao(Filme filme) {
        List<PaisProducao> paisProducaos = new ArrayList<>();
        if(filme.getPaisProducaos() != null){
            for (PaisProducao producao : filme.getPaisProducaos()){
                PaisProducao paisProducaoSalva = this.paisProducaoRepository.findByNomeAndAndCodigoPaisIso(producao.getNome(), producao.getCodigoPaisIso());
                if(paisProducaoSalva == null){
                    paisProducaoSalva = this.paisProducaoRepository.save(producao);
                }
                paisProducaos.add(paisProducaoSalva);
            }
            filme.setPaisProducaos(paisProducaos);
        }
    }

    private void verificaGeneros(Filme filme) {
        List<Genero> generos = new ArrayList<>();
        if(filme.getGeneros() != null) {
            for (Genero gen : filme.getGeneros()) {
                Genero generoSalvo = this.generoRepository.findByNome(gen.getNome());
                if(generoSalvo == null){
                    generoSalvo = this.generoRepository.save(gen);
                }
                generos.add(generoSalvo);
            }
            filme.setGeneros(generos);
        }
    }

    private void verificaEmpresaProducaos(Filme filme) {
        List<EmpresaProducao> empresaProducaos = new ArrayList<>();
        if (filme.getEmpresaProducaos() != null) {
            for (EmpresaProducao prod : filme.getEmpresaProducaos()) {
                EmpresaProducao empresaProducaoSalva = this.empresaProducaoRepository.findByIdExterno(prod.getIdExterno());
                if (empresaProducaoSalva == null) {
                    empresaProducaoSalva = this.empresaProducaoRepository.save(prod);
                }
                empresaProducaos.add(empresaProducaoSalva);
            }
            filme.setEmpresaProducaos(empresaProducaos);
        }
    }

    private void verificaLinguas(Filme filme) {
        List<Lingua> linguasSalvas = new ArrayList<>();
        if(filme.getLinguas() != null){
            for (Lingua lin : filme.getLinguas()) {
                if (!lin.getCodigoLinguaIso().isEmpty() && !lin.getNome().isEmpty()){
                    Lingua lingua = this.linguaRepository.findByCodigoLinguaIsoAndAndNome(lin.getCodigoLinguaIso(), lin.getNome());
                    if(lingua == null){
                        lingua = this.linguaRepository.save(lin);
                    }
                    linguasSalvas.add(lingua);
                }
            }
            filme.setLinguas(linguasSalvas);
        }
    }
}
