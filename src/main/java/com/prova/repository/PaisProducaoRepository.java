package com.prova.repository;

import com.prova.model.PaisProducao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisProducaoRepository extends JpaRepository<PaisProducao, Long> {

    PaisProducao findByNomeAndAndCodigoPaisIso(String nome, String CodigoPaisIso);
}
