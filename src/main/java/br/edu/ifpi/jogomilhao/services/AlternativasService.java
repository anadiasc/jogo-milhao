package br.edu.ifpi.jogomilhao.services;

import br.edu.ifpi.jogomilhao.repositories.AlternativasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlternativasService {
    private final AlternativasRepository alternativa;

    @Autowired
    public AlternativasService(AlternativasRepository alternativa) {
        this.alternativa = alternativa;
    }
}
