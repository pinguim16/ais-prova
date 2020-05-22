package com.prova.resource;

import com.prova.model.Filme;
import com.prova.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeResource {

    @Autowired
    public FilmeService filmeService;

    @GetMapping
    public ResponseEntity<?> getMovies(){
        return ResponseEntity.ok(this.filmeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable("id") Long id){
        Optional<Filme> filme = this.filmeService.findById(id);
        if(filme.isPresent()){
            return ResponseEntity.ok(filme.get());
        }else{
            return ResponseEntity.noContent().build();
        }
    }
}
