package br.com.educacao.educacao.dto;

public class AlunoRegistroDTO {

    private String username;
    private String password;
    private String nome;
    private String cpf;
    
	
	public String getUsername (){return username;}
	public String getPassword (){return password;}
	public String getNome () {return nome;}
	public String getCpf () {return cpf;}
	    
	
	public void setUsername (String username) {this.username=username;}
	public void setPassword (String password)  {this.password=password;}
	public void setNome (String nome) {this.nome=nome;}
	public void setCpf  (String cpf) {this.cpf=cpf;}
	}    