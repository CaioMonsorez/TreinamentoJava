package model;


public class Aluno extends Usuario implements IUsuario { //extends é a herança do usuario
	private int matricula; //crtl alt + seta p baixo
	private String nome;
	private String turno;
	private String turma;
	
	//metodo construtor simples
	public Aluno() {
		super();
	}

	@Override
	public void exibirMatriculaENome() {
		System.out.println("Aluno: ");
		System.out.println("Matricula: " + super.getLogin());
		System.out.println("Nome: " + this.matricula);
	}

	@Override
	public void mostrar() {
		System.out.println("Aluno: ");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome);	
	}

	/**
	 METODO CONSTRUTOR SIMPLES DA HERANÇA
	diferença nos construtores em relacao a herança. 
	source / generate constr using fields / ATENCAO NO DETALHE / Select 
	super constrctor to invoke e importar do usuario / 
	selectioar a caixa e marcar string string int / desmarcar tudo para ter o metodo
	construtor simples
	 **/
	
	
	public Aluno(String login, String senha, int tipo) {
		super(login, senha, tipo);
	}


	/**METODO CONSTRUTOR COMPLETO COM HERANÇA
	 * diferença nos construtores em relacao a herança. 
	source / generate constr using fields / ATENCAO NO DETALHE / Select 
	super constrctor to invoke e importar do usuario / 
	selectioar a caixa e marcar string string int / MARCAR tudo para ter o metodo
	construtor completo
	 **/
	public Aluno(String login, String senha, int tipo, int matricula, String nome, String turno, String turma) {
		super(login, senha, tipo);
		this.matricula = matricula;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
	}

	
	
	//metodo getter e setters nao mudam
	

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


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}




}
