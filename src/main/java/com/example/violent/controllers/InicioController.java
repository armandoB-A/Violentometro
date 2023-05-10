package com.example.violent.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inicio")
public class InicioController {
    @GetMapping
    public ResponseEntity<String> getInicio(){
        return new ResponseEntity<>("hola", HttpStatus.OK);
    }
}
