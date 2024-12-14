package br.edu.ifpi.jogomilhao.services;

import br.edu.ifpi.jogomilhao.repositories.UsuariosRepository;
import br.edu.ifpi.jogomilhao.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {
    private final UsuariosRepository usuario;

    @Autowired
    public UsuariosService(UsuariosRepository usuario) {
        this.usuario = usuario;
    }

    public List<Usuarios> findAll() {
        return usuario.findAll();
    }

    public void save(Usuarios u){
        usuario.save(u);
    }
}
