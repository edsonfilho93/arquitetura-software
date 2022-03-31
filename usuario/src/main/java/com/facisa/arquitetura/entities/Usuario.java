package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Usuario {

	public Usuario(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	@ApiModelProperty(value = "Código dao usuario")
	private int id;

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

	public void setId(int id) {
		this.id = id;
	}
}