package com.prova.model;

import javax.persistence.*;

@Entity
@Table(name = "lingua")
public class Lingua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo_lingua_iso")
    private String codigoLinguaIso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoLinguaIso() {
        return codigoLinguaIso;
    }

    public void setCodigoLinguaIso(String codigoLinguaIso) {
        this.codigoLinguaIso = codigoLinguaIso;
    }
}
