package com.prova.service;

import com.prova.model.Filme;
import com.prova.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> getAll(){
        return this.filmeRepository.findAll();
    }

    public Optional<Filme> findById(Long id){
        return this.filmeRepository.findById(id);
    }
}
