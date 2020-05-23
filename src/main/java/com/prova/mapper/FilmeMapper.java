package com.prova.mapper;

import com.prova.dto.FilmDTO;
import com.prova.model.Filme;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {GeneroMapper.class, EmpresaProducaoMapper.class, LinguaMapper.class, PaisProducaoMapper.class})
public interface FilmeMapper {

    FilmeMapper INSTANCE = Mappers.getMapper(FilmeMapper.class);

    @Mapping(source = "adult", target = "adulto")
    @Mapping(source = "backdropPath", target = "imagePath")
    @Mapping(source = "budget", target = "custo")
    @Mapping(source = "homepage", target = "homepage")
    @Mapping(source = "imdbId", target = "imdbId")
    @Mapping(source = "originalLanguage", target = "linguaOriginal")
    @Mapping(source = "originalTitle", target = "tituloOriginal")
    @Mapping(source = "overview", target = "enredo")
    @Mapping(source = "popularity", target = "popularidade")
    @Mapping(source = "posterPath", target = "posterPath")
    @Mapping(source = "releaseDate", target = "dataLancamento")
    @Mapping(source = "revenue", target = "lucro")
    @Mapping(source = "runtime", target = "duracao")
    @Mapping(target = "status", ignore = true)
    @Mapping(source = "tagline", target = "tagline")
    @Mapping(source = "title", target = "titulo")
    @Mapping(source = "video", target = "video")
    @Mapping(source = "voteAverage", target = "mediaVotos")
    @Mapping(source = "voteCount", target = "totalVotos")
    @Mapping(source = "productionCompanyDTOS", target = "empresaProducaos")
    @Mapping(source = "productionCountryDTOS", target = "paisProducaos")
    @Mapping(source = "genres", target = "generos")
    @Mapping(source = "spokenLanguageDTOS", target = "linguas")
    @Mapping(source = "id", target = "idExterno")
    Filme filmDTOToFilme(FilmDTO filmDTO);

}
