package com.com.ifood.ifood_api.entity;


import org.springframework.data.annotation.Id;

//import javax.persistence.Entity;


//@Entity
public class Restaurante {

    @Id
    private long id;

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
