package com.prova.model;

import javax.persistence.*;

@Entity
@Table(name = "paises_producao")
public class PaisProducao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "codigo_pais_iso")
    private String codigoPaisIso;

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

    public String getCodigoPaisIso() {
        return codigoPaisIso;
    }

    public void setCodigoPaisIso(String codigoPaisIso) {
        this.codigoPaisIso = codigoPaisIso;
    }
}
