package com.Inamhi.Inamhi.controlador;

import com.Inamhi.Inamhi.entidad.Solicitud;
import com.Inamhi.Inamhi.repositorio.SolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SolicitudController {
    @Autowired
    SolicitudRepository solicitudRepository;
    @GetMapping("/solicitud/formularioSolicitud")
    public String formularioSolicitud(Model model){
        model.addAttribute("solicitudes", new Solicitud());
        return "solicitud/formularioSolicitud";
    }
    @GetMapping("/solicitud")
    public String listaSolicitudes(Model model){
        List<Solicitud> solicitudes = solicitudRepository.findAll();
        model.addAttribute("solicitudes",solicitudes);
        return "solicitud/solicitud";
    }
    @GetMapping("/solicitud/formulario")
    public String crear(Solicitud solicitud){
        solicitudRepository.save(solicitud);
        return "redirect:/solicitud";
    }
}
