package com.prova.mapper;

import com.prova.dto.ProductionCompaniesDTO;
import com.prova.model.EmpresaProducao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EmpresaProducaoMapper {

    EmpresaProducaoMapper INSTANCE = Mappers.getMapper(EmpresaProducaoMapper.class);

    @Mapping(source = "name", target = "nome")
    @Mapping(source = "originCountry", target = "paisOrigem")
    @Mapping(source = "logoPath", target = "logoPath")
    @Mapping(source = "id", target = "idExterno")
    EmpresaProducao productionCompaniesDTOToEmpresaProducao(ProductionCompaniesDTO productionCompaniesDTO);

    List<EmpresaProducao> productionCompanyDTOSToEmpresaProducaos(List<ProductionCompaniesDTO> productionCompanyDTOS);
}
