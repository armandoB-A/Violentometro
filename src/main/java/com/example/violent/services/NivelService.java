package com.example.violent.services;

import com.example.violent.entities.Nivel;
import com.example.violent.repositories.NivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelService {
    @Autowired
    private NivelRepository nivelRepository;

    public List<Nivel> getNveles(){
        return nivelRepository.findAll();
    }
}
