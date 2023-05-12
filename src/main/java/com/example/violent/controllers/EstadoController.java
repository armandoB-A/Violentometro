package com.example.violent.controllers;

import com.example.violent.entities.Estado;
import com.example.violent.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("estado")
public class EstadoController {
    @Autowired
    private EstadoService estadoService;
    @GetMapping
    public ResponseEntity<List<Estado>> getEstados(){
        return new ResponseEntity<>(estadoService.getEstados(), HttpStatusCode.valueOf(200));
    }
}
