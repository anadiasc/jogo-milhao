package br.edu.ifpi.jogomilhao.controllers;

import br.edu.ifpi.jogomilhao.models.Usuarios;
import br.edu.ifpi.jogomilhao.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private final UsuariosService usuariosService;

    @Autowired
    public HomeController(UsuariosService usuariosService) {
        this.usuariosService = usuariosService;
    }

    @GetMapping("/")
    public String home() {
        return "homepage";
    }

}
