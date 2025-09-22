package com.andres.curso.springboot.jpa.springboot_jpa.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personas") //Esto es opcional si la clase se llama igual que la tabla
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastname;

    @Column(name = "programming_language")
    private String programminglanguage;

    public Person() {
        //Siempre que creamos un constructor personalizado deberemos crear un constructor vacío
        //Hibernate lo necesita para mapear la clase
    }
    
    public Person(Long id, String name, String lastname, String programminglanguage) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.programminglanguage = programminglanguage;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getProgramminglanguage() {
        return programminglanguage;
    }
    public void setProgramminglanguage(String programminglanguage) {
        this.programminglanguage = programminglanguage;
    }

}
