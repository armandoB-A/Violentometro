package com.example.violent.services;

import com.example.violent.entities.Opcion;
import com.example.violent.repositories.OpcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcionService {
    @Autowired
    private OpcionRepository opcionRepository;

    public List<Opcion> getOpcion(){
        return opcionRepository.findAll();
    }
}
