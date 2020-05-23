package com.prova;

import com.prova.service.GeraDadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ProvaAisDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaAisDigitalApplication.class, args);
	}
}
