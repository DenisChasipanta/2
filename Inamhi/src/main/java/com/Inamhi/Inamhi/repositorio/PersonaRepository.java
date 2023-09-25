package com.Inamhi.Inamhi.repositorio;


import com.Inamhi.Inamhi.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
