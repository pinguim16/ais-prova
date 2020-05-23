package com.prova.mapper;

import com.prova.dto.SpokenLanguagesDTO;
import com.prova.model.Lingua;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface LinguaMapper {

    LinguaMapper INSTANCE = Mappers.getMapper(LinguaMapper.class);

    @Mapping(source = "iso", target = "codigoLinguaIso")
    @Mapping(source = "name", target = "nome")
    Lingua spokenLanguagesDTOToLingua(SpokenLanguagesDTO spokenLanguagesDTO);

    List<Lingua> spokenLanguagesDTOSToLinguas (List<SpokenLanguagesDTO> spokenLanguagesDTOS);
}