package com.example.violent.controllers;

import com.example.violent.entities.Nivel;
import com.example.violent.services.NivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("nivel")
public class NivelController {
    @Autowired
    private NivelService nivelService;

    @GetMapping
    public ResponseEntity<List<Nivel>> getNiveles(){
        return new ResponseEntity<>(nivelService.getNveles(), HttpStatusCode.valueOf(200));
    }
}
