package model;

public class Pessoa {
	
	private int matricula;
	private String nome;
	private String dataNascimento;
	
	
	public Pessoa() {
		super();
	}

	public Pessoa(int matricula, String nome, String dataNascimento) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	

	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	

}
