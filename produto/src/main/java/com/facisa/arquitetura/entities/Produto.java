package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Produto {

	public Produto(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	@ApiModelProperty(value = "Código do produto")
	private int id;

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

	public void setId(int id) {
		this.id = id;
	}
}