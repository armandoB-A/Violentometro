package com.example.violent.services;

import com.example.violent.entities.Estado;
import com.example.violent.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> getEstados(){
        return estadoRepository.findAll();
    }
}
