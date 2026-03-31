package br.com.educacao.educacao.model;

import jakarta.persistence.*;

@Entity
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private int ano;
    private int semestre;

    public Turma() {}

    public Turma(Long id, String nome, int ano, int semestre) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.semestre = semestre;
    }

    // getters e setters
}