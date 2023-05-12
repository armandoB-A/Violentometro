package com.example.violent.services;

import com.example.violent.entities.Ley;
import com.example.violent.repositories.LeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeyService {
    @Autowired
    private LeyRepository leyRepository;
    public List<Ley> getLeyes(){
        return leyRepository.findAll();
    }
}
