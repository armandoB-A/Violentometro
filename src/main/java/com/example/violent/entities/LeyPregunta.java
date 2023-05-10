package com.example.violent.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ley_pregunta")
public class LeyPregunta {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pregunta")
    private Pregunta idPregunta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ley")
    private Ley idLey;

}