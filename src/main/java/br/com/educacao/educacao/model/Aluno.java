package br.com.educacao.educacao.model;

import jakarta.persistence.*;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private Double nota;
	private String materia;
    private int semestre

    public Aluno() {}
      
	  public Aluno(Long id, String nome, Double nota, String materia) {
        this.id = id;
        this.nome = nome;
       
    public Aluno(Long id, String nome, Double nota, String materia,int semestre) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
		this.materia=materia;
		this.semestre = semestre;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public Double getNota() { return nota; }
	public String getMateria(){return materia;}
	public String getSemestre(){return semestre;}

    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setNota(Double nota) { this.nota = nota; }
	public void setMateria(String materia){this.materia=materia;}
	public void setSemestre(String semestre){this.semestre=semestre;}
}