package br.edu.ifpi.jogomilhao.models;


import jakarta.persistence.*;

@Entity
@Table(name="alternativas")
public class Alternativas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int perguntas_id;
    private String alternativa;
    private String texto;

    @ManyToOne
    @JoinColumn(name = "pergunta_id")
    private Perguntas pergunta;


    public Alternativas(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerguntas_id() {
        return perguntas_id;
    }

    public void setPerguntas_id(int perguntas_id) {
        this.perguntas_id = perguntas_id;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
