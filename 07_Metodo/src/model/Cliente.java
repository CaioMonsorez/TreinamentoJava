package model;

public class Cliente {

	private String nome;
	private String dataNascimento;
	private int rg;
	
	
	
//	public String getNome() {
//		return this.nome;
//	}
//	
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
	
	//metodos getters e setters
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

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

		
	
	//Menu source, generate constructor fields
	public Cliente(String nome, String dataNascimento, int rg) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.rg = rg;
	}

	public Cliente(String nome, int rg) {
		super();
		this.nome = nome;
		this.rg = rg;
	}
	
	public Cliente() {
		super();	
	}
//	public Cliente(String nome, String dataNascimento, int rg) { //metodo construtor
//		this.nome = nome;
//		this.dataNascimento = dataNascimento;
//		this.rg = rg;
//	}
//	
//	public Cliente(String nome, int rg) { //metodo construtor
//		this.nome = nome;
//		this.rg = rg;
//	}
	
	
	
}
