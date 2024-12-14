package br.edu.ifpi.jogomilhao.repositories;

import br.edu.ifpi.jogomilhao.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

}
