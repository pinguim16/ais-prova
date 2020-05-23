package com.prova.repository;

import com.prova.model.EmpresaProducao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaProducaoRepository extends JpaRepository<EmpresaProducao, Long> {

    EmpresaProducao findByIdExterno(Long idExterno);

}
