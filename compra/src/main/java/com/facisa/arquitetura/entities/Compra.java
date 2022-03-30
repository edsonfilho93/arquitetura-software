package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Compra {
    @ApiModelProperty(value = "Código de compra")
    private long id;

    @ApiModelProperty(value = "Nome do cliente")
    private String nomeCliente;

    public long getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nome) {
        this.nomeCliente = nome;
    }

    public void setId(long id) {
        this.id = id;
    }
}