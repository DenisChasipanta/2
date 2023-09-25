package com.Inamhi.Inamhi.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Solicitud {
    @Id
    private Integer codigo;
    private LocalDate fechaCreacion;
    @ManyToOne
    @JoinColumn(name = "persona_codigo")
    private Persona persona;
}
