package com.example.violent.controllers;

import com.example.violent.entities.Pregunta;
import com.example.violent.services.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("pregunta")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping
    public ResponseEntity<List<Pregunta>> getPregunta(){
        return new ResponseEntity<>(preguntaService.getPregunta(), HttpStatusCode.valueOf(200));
    }
}
