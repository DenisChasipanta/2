package com.Inamhi.Inamhi.controlador;

import com.Inamhi.Inamhi.entidad.Persona;
import com.Inamhi.Inamhi.repositorio.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PersonaController {
    @Autowired
    PersonaRepository personaRepository;
    @GetMapping("/persona/formularioPersona")
    public String formularioPersona(Model model){
        model.addAttribute("personas", new Persona());
        return "persona/formularioPersona";
    }
    @GetMapping("/persona")
    public String persona(Model model){
        List<Persona> personas = personaRepository.findAll();
        model.addAttribute("personas",personas);
        return "persona/persona";
    }
    @GetMapping("/persona/formularioPersona")
    public String crear(Persona persona){
        personaRepository.save(persona);
        return "redirect:/persona";
    }


}
