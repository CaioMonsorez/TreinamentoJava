package model;

public class Responsavel {
	
	private int cnh;
	private String nome;
	private String dataNascimento;
	
	

	public String validarCnh(int valor) {
		if (this.cnh == valor) {

			return this.cnh + " --> APROVADO! Este é o número de CNH do (a)" + this.nome;
		} else {
			return this.cnh + " --> REPROVADO! Não será possível exibir o nome do responsável pois a CNH inserida não confere com os dados cadastrados em nossa base de dados ";
		}
	}
	
	public Responsavel() {
		super();
	}

	public Responsavel(int cnh, String nome, String dataNascimento) {
		super();
		this.cnh = cnh;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
		
	public int getCnh() {
		return cnh;
	}

	public void setCnh(int cnh) {
		this.cnh = cnh;
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
