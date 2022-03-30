package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Usuario {
    @ApiModelProperty(value = "Código dao usuario")
    private long id;

    @ApiModelProperty(value = "Nome da usuario")
    private String nome;

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(long id) {
        this.id = id;
    }
}