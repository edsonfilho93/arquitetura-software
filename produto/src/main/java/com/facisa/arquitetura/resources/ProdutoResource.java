package com.facisa.arquitetura.resources;

import com.facisa.arquitetura.entities.Produto;
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
public class ProdutoResource {


    @ApiOperation(value = "Retorna uma lista de produtos")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de produtos"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @RequestMapping(value = "/produto", method = RequestMethod.GET, produces = "application/json")
    public List<Produto> Get() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/produto/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Produto> GetById(@PathVariable(value = "id") long id) {
        Optional<Produto> usuario = null;
        if (usuario.isPresent())
            return new ResponseEntity<Produto>(usuario.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/produto", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Produto Post(@RequestBody Produto produto) {
        return new Produto();
    }

    @RequestMapping(value = "/produto/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Produto> Put(@PathVariable(value = "id") long id, @RequestBody Produto newUsuario) {
        Optional<Produto> oldusuario = null;
        if (oldusuario.isPresent()) {
            Produto usuario = oldusuario.get();
            usuario.setNome(newUsuario.getNome());
            return new ResponseEntity<Produto>(usuario, HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/produto/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id) {
        Optional<Produto> usuario = null;
        if (usuario.isPresent()) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}