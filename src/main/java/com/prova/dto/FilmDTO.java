package com.prova.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FilmDTO {

    private Integer id;

    private Boolean adult;

    @JsonProperty(value = "backdrop_path")
    private String backdropPath;

    private Integer budget;

    private String homepage;

    @JsonProperty(value = "imdb_id")
    private String imdbId;

    @JsonProperty(value = "original_language")
    private String originalLanguage;

    @JsonProperty(value = "original_title")
    private String originalTitle;

    private String overview;

    private Long popularity;

    @JsonProperty(value = "poster_path")
    private String posterPath;

    @JsonProperty(value = "release_date")
    private String releaseDate;

    private String revenue;

    private String runtime;

    private String status;

    private String tagline;

    private String title;

    private Boolean video;

    @JsonProperty(value = "vote_average")
    private Long voteAverage;

    @JsonProperty(value = "vote_count")
    private Long voteCount;

    @JsonProperty(value = "production_companies")
    private List<ProductionCompaniesDTO> productionCompanyDTOS;

    @JsonProperty(value = "production_countries")
    private List<ProductionCountriesDTO> productionCountryDTOS;

    private List<GenreDTO> genres;

    @JsonProperty(value = "spoken_languages")
    private List<SpokenLanguagesDTO> spokenLanguageDTOS;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
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

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Long getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Long voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Long voteCount) {
        this.voteCount = voteCount;
    }

    public List<ProductionCompaniesDTO> getProductionCompanyDTOS() {
        return productionCompanyDTOS;
    }

    public void setProductionCompanyDTOS(List<ProductionCompaniesDTO> productionCompanyDTOS) {
        this.productionCompanyDTOS = productionCompanyDTOS;
    }

    public List<ProductionCountriesDTO> getProductionCountryDTOS() {
        return productionCountryDTOS;
    }

    public void setProductionCountryDTOS(List<ProductionCountriesDTO> productionCountryDTOS) {
        this.productionCountryDTOS = productionCountryDTOS;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDTO> genres) {
        this.genres = genres;
    }

    public List<SpokenLanguagesDTO> getSpokenLanguageDTOS() {
        return spokenLanguageDTOS;
    }

    public void setSpokenLanguageDTOS(List<SpokenLanguagesDTO> spokenLanguageDTOS) {
        this.spokenLanguageDTOS = spokenLanguageDTOS;
    }
}