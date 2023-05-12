package com.example.violent.repositories;

import com.example.violent.entities.Ley;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeyRepository extends JpaRepository<Ley, Integer> {
}