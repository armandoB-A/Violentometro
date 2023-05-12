package com.example.violent.services;

import com.example.violent.entities.Respuesta;
import com.example.violent.repositories.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;

    public List<Respuesta> getRespuesta(){
        return respuestaRepository.findAll();
    }
}
