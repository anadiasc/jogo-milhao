package br.edu.ifpi.jogomilhao.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="perguntas")
public class Perguntas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String pergunta;
    private int nivel;
    private String resposta_correta;

    @OneToMany(fetch =FetchType.EAGER)
    private List<Alternativas> alternativas;

    public Perguntas(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getResposta_correta() {
        return resposta_correta;
    }

    public void setResposta_correta(String resposta_correta) {
        this.resposta_correta = resposta_correta;
    }

    public List<Alternativas> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(List<Alternativas> alternativas) {
        this.alternativas = alternativas;
    }
}
