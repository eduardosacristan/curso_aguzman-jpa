package com.andres.curso.springboot.jpa.springboot_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner{ //implementamos la interfaz porque no vamos a trabajar via web sino en linea de comandos

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	//Con este metodo trabajaremos en consola
	@Override
	public void run(String... args) throws Exception {
		
	}

}
