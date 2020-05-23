package com.prova.repository;

import com.prova.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Filme findByIdExterno(Long idExterno);

}
