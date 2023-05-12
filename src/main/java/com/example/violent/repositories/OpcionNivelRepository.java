package com.example.violent.repositories;

import com.example.violent.entities.OpcionNivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpcionNivelRepository extends JpaRepository<OpcionNivel, Integer> {
}