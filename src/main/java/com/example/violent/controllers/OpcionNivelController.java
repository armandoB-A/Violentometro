package com.example.violent.controllers;

import com.example.violent.entities.OpcionNivel;
import com.example.violent.services.OpcionNivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("opcionNivel")
public class OpcionNivelController {
    @Autowired
    private OpcionNivelService opcionNivelService;

    @GetMapping
    public ResponseEntity<List<OpcionNivel>> getOpcionNivel(){
        return new ResponseEntity<>(opcionNivelService.getOpcionNivel(), HttpStatusCode.valueOf(200));
    }
}
