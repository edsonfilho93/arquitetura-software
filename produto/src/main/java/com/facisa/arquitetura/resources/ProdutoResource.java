package com.facisa.arquitetura.resources;

import com.facisa.arquitetura.entities.Produto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class ProdutoResource {

	@ApiOperation(value = "Retorna uma lista de produtos")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Retorna a lista de produtos"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"), })
	@RequestMapping(value = "/produto", method = RequestMethod.GET, produces = "application/json")
	public List<Produto> findProdutos() {
		return Arrays.asList(new Produto(1, "Bola"), new Produto(2, "Caderno"));
	}
}