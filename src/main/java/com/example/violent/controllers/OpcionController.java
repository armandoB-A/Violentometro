package com.example.violent.controllers;

import com.example.violent.entities.Opcion;
import com.example.violent.services.OpcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("opcion")
public class OpcionController {
    @Autowired
    private OpcionService opcionService;
    @GetMapping
    public ResponseEntity<List<Opcion>> getOpcion(){
        return new ResponseEntity<>(opcionService.getOpcion(), HttpStatusCode.valueOf(200));
    }
}
