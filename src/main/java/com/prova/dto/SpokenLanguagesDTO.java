package com.prova.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpokenLanguagesDTO {

    @JsonProperty(value = "iso_639_1")
    private String iso;

    private String name;

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
