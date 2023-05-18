package controller;

import model.Aluno;
import model.Pessoa;
import model.Professor;

public class Cadastro {

	public static void main(String[] args) {

		Aluno ana = new Aluno();
		ana.setMatricula(220);
		ana.setNome("Ana Cristina");
		ana.setDataNascimento("20/10/2010");
		ana.setCurso("ADS");
		
		System.out.println("Nome: " + ana.getNome());

		System.out.println("Curso: " + ana.getCurso());
		
		Professor alex = new Professor(32, "Alex Oliveira", "20/12/2000", "T.I");

		System.out.println("Nome: " + alex.getNome());
		System.out.println("Formacao: " + alex.getFormacao());
		
		Pessoa carlos = new Pessoa(100, "Carlos Fernando", "20/08/2000");
		System.out.println("Nome: " + carlos.getNome());
		System.out.println("Formacao: " + carlos.getDataNascimento());
		
	}

}
