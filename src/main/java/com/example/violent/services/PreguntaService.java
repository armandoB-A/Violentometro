package com.example.violent.services;

import com.example.violent.entities.Pregunta;
import com.example.violent.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;
    public List<Pregunta> getPregunta(){
        return preguntaRepository.findAll();
    }
}
