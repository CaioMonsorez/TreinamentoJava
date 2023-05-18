package model;

//colocar como classe abstrata, colocar na superclasse o abstract
public abstract class Usuario {
	private String login;
	private String senha;
	private int tipo; //1 para aluno, 2 para professor, 0 para usuario
	
	public abstract void mostrar(); //so funciona em classe abstrata, com isso todos os models precisam ter o metodo mostrar()
	
	//polimorfismo é quebrar o metodo da herança e fazer so na classe qe deseja fora da herança
	public void exibirDados() {
		String tipoUsuario;
		if(this.tipo == 1) {
			tipoUsuario = "Aluno";
		}else {
			if (this.tipo == 2) {
				tipoUsuario = "Professor";
			} else {
				tipoUsuario = "Usuario";
			}
		}
		System.out.print("\n"+ tipoUsuario + ": Login " + this.login);
	}
	
	
	
	
	//metodo construtor simples
	public Usuario() {
		super();
	}

	//metodo construtor completo
	public Usuario(String login, String senha, int tipo) {
		super();
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
	}

	
	// metodos getters e setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	 

	
}
