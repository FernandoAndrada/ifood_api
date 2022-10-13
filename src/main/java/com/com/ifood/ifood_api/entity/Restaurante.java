package com.com.ifood.ifood_api.entity;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

//import javax.persistence.Entity;


public class Restaurante {


    private Long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String nome;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
