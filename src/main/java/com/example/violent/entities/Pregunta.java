package com.example.violent.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pregunta")
public class Pregunta {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel")
    private Nivel idNivel;

}