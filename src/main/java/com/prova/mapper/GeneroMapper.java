package com.prova.mapper;

import com.prova.dto.GenreDTO;
import com.prova.model.Genero;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface GeneroMapper {

    GeneroMapper INSTANCE = Mappers.getMapper(GeneroMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "nome")
    Genero genreDTOTOGenero(GenreDTO genre);

    List<Genero> genreDTOSToGeneros(List<GenreDTO> genreDTOS);
}
