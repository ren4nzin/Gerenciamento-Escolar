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

   public Turma(Long id, String nome, int ano) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
   }
    public Turma(Long id, String nome, int ano, int semestre) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.semestre = semestre;
    }
    public Long getId ( ){return id;}
	public String getNome (){return nome;}
	public int getAno() {return ano;}
	public int getSemestre (){return semestre;}
	
	
	public void setId (Long id){this.id =id;}
	public void setNome (String nome){this.nome=nome;}
	public void setAno (int ano){this.ano=ano;}
	public void setSemestre (int semestre){this.semestre=semestre;}
    
    
}