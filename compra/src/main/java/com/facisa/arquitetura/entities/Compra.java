package com.facisa.arquitetura.entities;

import io.swagger.annotations.ApiModelProperty;

public class Compra {

	public Compra(int id, int idCliente, int idProduto) {
		this.id = id;
		this.idCliente = idCliente;
		this.idProduto = idProduto;
	}

	@ApiModelProperty(value = "Código de compra")
	private int id;

	@ApiModelProperty(value = "id do cliente")
	private int idCliente;

	@ApiModelProperty(value = "id do produto")
	private int idProduto;

	public long getId() {
		return id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public void setId(int id) {
		this.id = id;
	}
}