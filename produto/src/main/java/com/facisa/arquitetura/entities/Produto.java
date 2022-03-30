package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Produto {
    @ApiModelProperty(value = "Código do produto")
    private long id;

    @ApiModelProperty(value = "Nome do produto")
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