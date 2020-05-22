package com.prova.mapper;

import com.prova.dto.ProductionCountriesDTO;
import com.prova.model.PaisProducao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PaisProducaoMapper {

    PaisProducaoMapper INSTANCE = Mappers.getMapper(PaisProducaoMapper.class);

    @Mapping(source = "name", target = "nome")
    @Mapping(source = "iso", target = "codigoPaisIso")
    PaisProducao productionCountriesDTOToPaisProducao(ProductionCountriesDTO productionCountriesDTO);

    List<PaisProducao> productionCountriesDTOSToPaisProducaos (List<ProductionCountriesDTO> productionCountriesDTOS);
}
