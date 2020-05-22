package com.prova.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductionCompaniesDTO {

    private Long id;

    private String name;

    @JsonProperty(value = "logo_path")
    private String logoPath;

    @JsonProperty(value = "origin_country")
    private String originCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
