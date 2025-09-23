package com.andres.curso.springboot.jpa.springboot_jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.andres.curso.springboot.jpa.springboot_jpa.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByProgramminglanguage(String programminglanguage);

    //@Query("select p from Person p") //Busca todos los objetos persona
    @Query("select p from Person p where p.programminglanguage=?1 and p.name = ?2") //Busca todos los objetos persona
    List<Person> buscarByProgramminglanguage(String programminglanguage, String name);

    @Query("select p.name, p.programminglanguage from Person p")
    List<Object[]> obtenerPersonData();

}
