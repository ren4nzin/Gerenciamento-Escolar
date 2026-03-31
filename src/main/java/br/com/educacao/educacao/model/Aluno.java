package br.com.educacao.educacao.model;

import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Double nota;

    public Aluno() {}

    public Aluno(Long id, String nome, Double nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public Double getNota() { return nota; }

    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setNota(Double nota) { this.nota = nota; }
}