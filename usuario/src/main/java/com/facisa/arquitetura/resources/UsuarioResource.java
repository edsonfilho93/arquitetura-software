package com.facisa.arquitetura.resources;

import com.facisa.arquitetura.entities.Usuario;
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
public class UsuarioResource {


    @ApiOperation(value = "Retorna uma lista de Usuarios")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna a lista de usuario"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @RequestMapping(value = "/usuario", method = RequestMethod.GET, produces = "application/json")
    public List<Usuario> Get() {
        return new ArrayList<>();
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Usuario> GetById(@PathVariable(value = "id") long id) {
        Optional<Usuario> usuario = null;
        if (usuario.isPresent())
            return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/usuario", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    public Usuario Post(@RequestBody Usuario usuario) {
        return new Usuario();
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
    public ResponseEntity<Usuario> Put(@PathVariable(value = "id") long id, @RequestBody Usuario newUsuario) {
        Optional<Usuario> oldusuario = null;
        if (oldusuario.isPresent()) {
            Usuario usuario = oldusuario.get();
            usuario.setNome(newUsuario.getNome());
            return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Object> Delete(@PathVariable(value = "id") long id) {
        Optional<Usuario> usuario = null;
        if (usuario.isPresent()) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}