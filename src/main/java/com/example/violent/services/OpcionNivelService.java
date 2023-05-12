package com.example.violent.services;

import com.example.violent.entities.OpcionNivel;
import com.example.violent.repositories.OpcionNivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpcionNivelService {
    @Autowired
    private OpcionNivelRepository opcionNivelRepository;

    public List<OpcionNivel> getOpcionNivel(){
        return opcionNivelRepository.findAll();
    }
}
