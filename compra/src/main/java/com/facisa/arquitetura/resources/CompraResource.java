package com.facisa.arquitetura.resources;

import com.facisa.arquitetura.entities.Compra;
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
public class CompraResource {

	@ApiOperation(value = "Retorna uma lista de compras")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Retorna a lista de compras"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"), })

	@RequestMapping(value = "/compra", method = RequestMethod.GET, produces = "application/json")
	public List<Compra> getCompras() {
		Compra compra = new Compra(1, 1, 1);
		return Arrays.asList(compra);
	}

}