package br.edu.ifpi.jogomilhao.controllers;

import br.edu.ifpi.jogomilhao.models.Perguntas;
import br.edu.ifpi.jogomilhao.models.Usuarios;
import br.edu.ifpi.jogomilhao.repositories.PerguntasRepository;
import br.edu.ifpi.jogomilhao.services.AlternativasService;
import br.edu.ifpi.jogomilhao.services.PerguntasService;
import br.edu.ifpi.jogomilhao.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/jogo")
public class JogoController {
    private final UsuariosService usuariosService;
    private final PerguntasService perguntasService;
    private final AlternativasService alternativasService;

   // private PerguntasRepository perguntasRepository;


    @Autowired
    public JogoController(UsuariosService usuariosService, PerguntasService perguntasService, AlternativasService alternativasService) {
        this.usuariosService = usuariosService;
        this.perguntasService = perguntasService;
        this.alternativasService = alternativasService;
    }

    @GetMapping()
    public String jogo(Model model,
                       @RequestParam String nickname) {
        //List<Usuarios> listaUsuarios = usuariosService.findAll();

        Usuarios usuario = new Usuarios();

        usuario.setNickname(nickname);
        usuario.setData(LocalDate.now());

        List<Perguntas> perguntas = perguntasService.buscarPerguntas();


        model.addAttribute("perguntas", perguntas);

        return "jogo-do-milhao";
    }
}
