package model;

public class Professor extends Usuario implements IUsuario {
	private int matriculaProfessor;
	private String nome;
	private String especialidade;
	
	//abstrat
	
	@Override //abstrato obrigatorio
	public void exibirLoginEMatricula() {
		System.out.println("Professor: ");
		System.out.println("Matricula: " + this.matriculaProfessor);
		System.out.println("Nome: " + this.nome);
	}
	@Override //abstrato obrigatorio
	public void mostrar() {
		System.out.println("Professor: ");
		System.out.println("Matricula: " + this.matriculaProfessor);
		System.out.println("Nome: " + this.nome);
	}
	
	
	//polimorfismo
	@Override
	public void exibirDados() {
//		System.out.println("Professor: Login " + super.getLogin() + "- Especialidade: " + this.especialidade);		
		super.exibirDados();
		System.out.print("- Especialidade: " + this.especialidade);
	}
	
	public Professor() {
		super();
	}


	public Professor(String login, String senha, int tipo, int matriculaProfessor, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}


	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}


	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	
}
