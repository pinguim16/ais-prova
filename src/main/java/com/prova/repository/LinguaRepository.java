package com.prova.repository;

import com.prova.model.Lingua;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinguaRepository extends JpaRepository<Lingua, Long> {

    Lingua findByCodigoLinguaIsoAndAndNome(String codigoLinguaIso, String nome);
}
