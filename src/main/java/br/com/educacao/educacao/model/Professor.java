package br.com.educacao.educacao.model;

import jakarta.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private int cargaHoraria;
    private double horaAula;



    public Professor() {}

    public Professor(Long id, String nome, int cargaHoraria,double horaAula) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.horaAula = horaAula;
    }
    public long getId (){return id;}
    public String getNome (){return nome;}
    public int getCargaHoraria (){return cargaHoraria;}
    public double getHoraAula() {return horaAula;}

    public void setId (Long id){this.id = id; }
    public void setNome (String nome){this.nome = nome; }
    public void setCargaHoraria (int cargaHoraria){this.cargaHoraria = cargaHoraria; }
    public void setHoraAula(double horaAula){this.horaAula = horaAula; }

}