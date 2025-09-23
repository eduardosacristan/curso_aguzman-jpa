package com.andres.curso.springboot.jpa.springboot_jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andres.curso.springboot.jpa.springboot_jpa.entities.Person;
import com.andres.curso.springboot.jpa.springboot_jpa.repositories.PersonRepository;

@SpringBootApplication
public class SpringbootJpaApplication implements CommandLineRunner{ //implementamos la interfaz porque no vamos a trabajar via web sino en linea de comandos

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaApplication.class, args);
	}

	//Con este metodo trabajaremos en consola
	@Override
	public void run(String... args) throws Exception {
		List<Person> persons = (List<Person>) personRepository.findAll();
		persons.stream().forEach(person -> System.out.println(person));
		
	}

}
