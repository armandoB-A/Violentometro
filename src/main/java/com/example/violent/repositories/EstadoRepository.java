package com.example.violent.repositories;

import com.example.violent.entities.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

    @Override
    Optional<Estado> findById(Integer integer);
}