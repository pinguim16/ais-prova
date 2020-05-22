package com.prova.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adulto")
    private String adulto;

    @Column(name = "image_path")
    private String imagePath;

    @Column(name = "custo")
    private Long custo;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "imdb_id")
    private String imdbId;

    @Column(name = "lingua_original")
    private String linguaOriginal;

    @Column(name = "titulo_original")
    private String tituloOriginal;

    @Column(name = "enredo")
    private String enredo;

    @Column(name = "popularidade")
    private Double popularidade;

    @Column(name = "poster_path")
    private String posterPath;

    @Column(name = "data_lancamento")
    private String dataLancamento;

    @Column(name = "lucro")
    private Integer lucro;

    @Column(name = "duracao")
    private Integer duracao;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "tagline")
    private String tagline;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "video")
    private Boolean video;

    @Column(name = "media_votos")
    private Integer mediaVotos;

    @Column(name = "total_votos")
    private Integer totalVotos;

    @Column(name = "id_externo")
    private Long idExterno;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_genero", joinColumns=
            {@JoinColumn(name="filme_id")}, inverseJoinColumns=
            {@JoinColumn(name="genero_id")})
    private List<Genero> generos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_empresa_producao", joinColumns=
            {@JoinColumn(name="filme_id")}, inverseJoinColumns=
            {@JoinColumn(name="empresa_producao_id")})
    private List<EmpresaProducao> empresaProducaos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_pais_producao", joinColumns=
            {@JoinColumn(name="filme_id")}, inverseJoinColumns=
            {@JoinColumn(name="pais_producao_id")})
    private List<PaisProducao> paisProducaos;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "filme_pais_producao", joinColumns=
            {@JoinColumn(name="filme_id")}, inverseJoinColumns=
            {@JoinColumn(name="pais_producao_id")})
    private List<Lingua> linguas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdulto() {
        return adulto;
    }

    public void setAdulto(String adulto) {
        this.adulto = adulto;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Long getCusto() {
        return custo;
    }

    public void setCusto(Long custo) {
        this.custo = custo;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getLinguaOriginal() {
        return linguaOriginal;
    }

    public void setLinguaOriginal(String linguaOriginal) {
        this.linguaOriginal = linguaOriginal;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getEnredo() {
        return enredo;
    }

    public void setEnredo(String enredo) {
        this.enredo = enredo;
    }

    public Double getPopularidade() {
        return popularidade;
    }

    public void setPopularidade(Double popularidade) {
        this.popularidade = popularidade;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Integer getLucro() {
        return lucro;
    }

    public void setLucro(Integer lucro) {
        this.lucro = lucro;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Integer getMediaVotos() {
        return mediaVotos;
    }

    public void setMediaVotos(Integer mediaVotos) {
        this.mediaVotos = mediaVotos;
    }

    public Integer getTotalVotos() {
        return totalVotos;
    }

    public void setTotalVotos(Integer totalVotos) {
        this.totalVotos = totalVotos;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<EmpresaProducao> getEmpresaProducaos() {
        return empresaProducaos;
    }

    public void setEmpresaProducaos(List<EmpresaProducao> empresaProducaos) {
        this.empresaProducaos = empresaProducaos;
    }

    public List<PaisProducao> getPaisProducaos() {
        return paisProducaos;
    }

    public void setPaisProducaos(List<PaisProducao> paisProducaos) {
        this.paisProducaos = paisProducaos;
    }

    public List<Lingua> getLinguas() {
        return linguas;
    }

    public void setLinguas(List<Lingua> linguas) {
        this.linguas = linguas;
    }

    public Long getIdExterno() {
        return idExterno;
    }

    public void setIdExterno(Long idExterno) {
        this.idExterno = idExterno;
    }
}
