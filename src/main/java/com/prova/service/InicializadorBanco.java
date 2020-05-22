package com.prova.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class InicializadorBanco {

    private static final Logger log = LoggerFactory.getLogger(InicializadorBanco.class);

    @Autowired
    private GeraDadosService geraDadosService;

    @PostConstruct
    private void init(){
        log.info("InicializadorBanco exec ...");
        this.geraDadosService.preencheBanco();
    }
}
