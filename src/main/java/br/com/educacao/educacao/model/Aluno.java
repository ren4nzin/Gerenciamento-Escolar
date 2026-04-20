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
    private int semestre;
	private String cpf;
	
	
	@OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
	
	
	
	 @ManyToOne
    @JoinColumn(name = "turma_id")
	private Turma turma;
	//aluno tem uma turma
	
    public Aluno() {}
      
	  public Aluno(Long id, String nome, Double nota, String materia) {
         this.id = id;
        this.nome = nome;
        this.nota = nota;
		this.materia = materia;
	  }
	    public Aluno(Long id, String nome, Double nota, Turma turma,String cpf) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
		this.turma = turma;
		this.cpf = cpf;
	  }
	    public Aluno( String nome, Double nota, String materia,int semestre,Turma turma) {
        this.nome = nome;
        this.nota = nota;
		this.materia = materia;
		this.semestre = semestre;
		this.turma = turma;
		
		
	}
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public Double getNota() { return nota; }
	public String getMateria(){return materia;}
	public int getSemestre(){return semestre;}
	public Usuario getUsuario() { return usuario; }
	public Turma getTurma() {return turma;}
    public String getCpf () {return cpf;}


    public void setId(Long id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setNota(Double nota) { this.nota = nota; }
	public void setMateria(String materia){this.materia=materia;}
	public void setSemestre(int semestre){this.semestre=semestre;}
	public void setUsuario(Usuario usuario) { this.usuario = usuario; }
	public void setTurma (Turma turma) {this.turma=turma;}
	public void setCpf (String cpf) {this.cpf =cpf;}
}