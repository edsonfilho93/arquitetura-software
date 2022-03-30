package com.facisa.arquitetura.resources;

import com.facisa.arquitetura.entities.Compra;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CompraResource {


    @ApiOperation(value = "Retorna uma lista de compras")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de compras"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @RequestMapping(value = "/compra", method = RequestMethod.GET, produces = "application/json")
    public List<Compra> Get() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/compra/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Compra> GetById(@PathVariable(value = "id") long id) {
        Optional<Compra> usuario = null;
        if (usuario.isPresent())
            return new ResponseEntity<Compra>(usuario.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/compra", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Compra Post(@RequestBody Compra usuario) {
        return new Compra();
    }

    @RequestMapping(value = "/compra/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Compra> Put(@PathVariable(value = "id") long id, @RequestBody Compra newUsuario) {
        Optional<Compra> oldusuario = null;
        if (oldusuario.isPresent()) {
            Compra usuario = oldusuario.get();
            usuario.setNomeCliente(newUsuario.getNomeCliente());
            return new ResponseEntity<Compra>(usuario, HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/compra/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id) {
        Optional<Compra> usuario = null;
        if (usuario.isPresent()) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}