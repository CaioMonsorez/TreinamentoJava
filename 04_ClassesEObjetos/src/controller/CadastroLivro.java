package controller;

import model.Livro;

public class CadastroLivro {

	public static void main(String[] args) {
		Livro gaurelli = new Livro ();
		gaurelli.isbn = 132;
		gaurelli.nome = "Sistemas Distribuidos";
		gaurelli.autor = "Gaurelli Ruper";
		gaurelli.editora = "O'Reylli";
		
		System.err.println();
		System.out.println("O isbn é " + gaurelli.isbn);
		System.out.println("O nome do Livro é " + gaurelli.nome);
		System.out.println("O autor é " + gaurelli.autor);
		System.out.println("A editora é " + gaurelli.editora + "\n");
		
		Livro ficcao = new Livro();
		ficcao.isbn = 4578888;
		ficcao.nome = "Algoritmo de Destruição em massa";
		ficcao.autor = "CathoNel";
		ficcao.editora = "Orelli";
		
		System.out.println("O isbn é " + ficcao.isbn);
		System.out.println("O nome do Livro é " + ficcao.isbn);
		System.out.println("O autor é " + ficcao.autor);
		System.out.println("A editora é " + ficcao.editora + "\n");
		
		Livro acao = new Livro();
		acao.isbn = 7891521;
		acao.nome = "A Queda";
		acao.autor = "Seila";
		acao.editora = "Livre";
		
		System.out.println("O isbn é " + acao.isbn);
		System.out.println("O nome do Livro é " + acao.isbn);
		System.out.println("O autor é " + acao.autor);
		System.out.println("A editora é " + acao.editora + "\n");

	}

}
