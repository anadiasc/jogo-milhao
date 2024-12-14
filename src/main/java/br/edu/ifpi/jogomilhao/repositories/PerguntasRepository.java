package br.edu.ifpi.jogomilhao.repositories;

import br.edu.ifpi.jogomilhao.models.Perguntas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PerguntasRepository extends JpaRepository<Perguntas,Integer> {

    /*@Query("SELECT p " +
            "FROM Perguntas p " +
            "JOIN fetch Alternativas a " +
            "ORDER BY p.id, a.alternativa")
    List<Perguntas> findPerguntasComAlternativas();*/

}
