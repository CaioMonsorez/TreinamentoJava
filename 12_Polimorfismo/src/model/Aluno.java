package model;

public class Aluno extends Pessoa {
	
	private String curso;

	
	//jeito 1 de exlicacao polimorfismo
//	public String toString() {
//		return "Matricula: " + super.getMatricula() + 
//				", Nome: " + super.getNome() + 
//				", Curso: " + this.curso;
//	}
//	
	//jeito 2 de exlicacao polimorfismo - o sinal verde ao lado significa que vc matou a herança
	//qnd for polimorfismo tem q fazer notação com @Override
	
	@Override
	public String toString() {
		return super.toString() + "- Curso: " + this.curso;
	}
	
	public Aluno() {
		super();
	}

	public Aluno(int matricula, String nome, String dataNascimento, String curso) {
		super(matricula, nome, dataNascimento);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
