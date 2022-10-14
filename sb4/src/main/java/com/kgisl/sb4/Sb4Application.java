package com.kgisl.sb4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class Sb4Application {

	public static void main(String[] args) {
		SpringApplication.run(Sb4Application.class, args);
	}

}
