package com.example.violent.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "opcion_nivel")
public class OpcionNivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_opcion")
    private Opcion idOpcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_nivel")
    private Nivel idNivel;

    @Column(name = "puntaje")
    private Integer puntaje;

}