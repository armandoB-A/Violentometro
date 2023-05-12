package com.example.violent.controllers;

import com.example.violent.entities.Usuario;
import com.example.violent.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public ResponseEntity<List<Usuario>> getUsuarios(){
        return new ResponseEntity<>(usuarioService.getUsuarios(), HttpStatusCode.valueOf(200));
    }
}
