package com.example.violent.controllers;

import com.example.violent.entities.Respuesta;
import com.example.violent.repositories.RespuestaRepository;
import com.example.violent.services.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("respuesta")
public class RespuestaController {
    @Autowired
    private RespuestaService respuestaService;
    @GetMapping
    public ResponseEntity<List<Respuesta>> getRespuesta(){
        return new ResponseEntity<>(respuestaService.getRespuesta(), HttpStatusCode.valueOf(200));
    }
}
