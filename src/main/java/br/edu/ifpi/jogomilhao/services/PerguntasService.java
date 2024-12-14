package br.edu.ifpi.jogomilhao.services;

import br.edu.ifpi.jogomilhao.models.Perguntas;
import br.edu.ifpi.jogomilhao.repositories.PerguntasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerguntasService {
    private final PerguntasRepository perguntas;

    @Autowired
    public PerguntasService(PerguntasRepository perguntas) {
        this.perguntas = perguntas;
    }

    public List<Perguntas> buscarPerguntas() {
        return perguntas.findAll();
    }

    /*public Page<Perguntas> buscarPerguntas(Pageable pageable) {
        return perguntas.findAll(pageable);
    }*/
}
