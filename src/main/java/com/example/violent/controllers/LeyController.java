package com.example.violent.controllers;

import com.example.violent.entities.Ley;
import com.example.violent.services.LeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ley")
public class LeyController {
    @Autowired
    private LeyService leyService;

    @GetMapping
    public ResponseEntity<List<Ley>> getLeyes(){
        return new ResponseEntity<>(leyService.getLeyes(), HttpStatusCode.valueOf(200));
    }
}
