package com.sebrus.precios_sepa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public CommandLineRunner ejecutarAlInicio() {
//		return args -> {
//			System.out.println("Ejecutando lógica de inicialización...");
//			// Aquí puedes hacer inserciones en la base de datos, etc.
//		};
//	}

}
