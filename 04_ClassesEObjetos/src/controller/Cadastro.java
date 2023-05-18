package controller;

import model.Carro;
import model.Funcionario;
import model.Livro;
import model.Motocicleta;
import model.Produto;


public class Cadastro {

	public static void main(String[] args) {

		Carro honda = new Carro();
		
		honda.fabricante = "Honda";
		honda.modelo = "Honda Fit";
		honda.cor = "Amarelo";
		honda.ano = 2023;
		
		System.err.println();
		System.out.println("O fabricante do Carro é " + honda.fabricante);
		System.out.println("O modelo do Carro é " + honda.modelo);
		System.out.println("O cor do Carro é " + honda.cor);
		System.out.println("O ano do Carro é " + honda.ano);
		
		Carro corolla = new Carro();
		
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.cor = "Preto";
		corolla.ano = 2023;

		System.err.println();
		System.out.println("O fabricante do Carro é " + corolla.fabricante);
		System.out.println("O modelo do Carro é " + corolla.modelo);
		System.out.println("O cor do Carro é " + corolla.cor);
		System.out.println("O ano do Carro é " + corolla.ano);

		Carro chevrolet = new Carro();
		
		chevrolet.fabricante = "Chevrolet";
		chevrolet.modelo = "Tracker";
		chevrolet.cor = "Preto";
		chevrolet.ano = 2023;

		System.err.println();
		System.out.println("O fabricante do Carro é " + chevrolet.fabricante);
		System.out.println("O modelo do Carro é " + chevrolet.modelo);
		System.out.println("O cor do Carro é " + chevrolet.cor);
		System.out.println("O ano do Carro é " + chevrolet.ano);
		
		Motocicleta yamaha = new Motocicleta();
		
		yamaha.modelo = "Fazer 250";
		yamaha.ano = 2023;
		yamaha.cilindrada = 520;
		
		System.err.println();
		System.out.println("O modelo da motocicleta é " + yamaha.modelo);
		System.out.println("O ano da motocicleta é " + yamaha.ano);
		System.out.println("A cilindrada da motocicleta é " + yamaha.cilindrada);
	
	
		Motocicleta motohonda = new Motocicleta();
		
		motohonda.modelo = "Biz";
		motohonda.ano = 2023;
		motohonda.cilindrada = 50;
		
		System.err.println();
		System.out.println("O modelo da motocicleta é " + motohonda.modelo);
		System.out.println("O ano da motocicleta é " + motohonda.ano);
		System.out.println("A cilindrada da motocicleta é " + motohonda.cilindrada);
		
		Motocicleta ducati = new Motocicleta();
		
		ducati.modelo = "Panigale V4 R";
		ducati.ano = 2023;
		ducati.cilindrada = 600;
		
		System.err.println();
		System.out.println("O modelo da motocicleta é " + ducati.modelo);
		System.out.println("O ano da motocicleta é " + ducati.ano);
		System.out.println("A cilindrada da motocicleta é " + ducati.cilindrada);
		
		Funcionario eduardo = new Funcionario();
		eduardo.matricula = 123;
		eduardo.nome = "Eduardo da Silva Sauro";
		eduardo.cpf = "123-456-78";
		
		System.err.println();
		System.out.println("A matricula é " + eduardo.matricula);
		System.out.println("O nome do Funcionario é " + eduardo.nome);
		System.out.println("O cpf é " + eduardo.cpf);
		
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
				
		
		Produto carro = new Produto();
		carro.idProduto = 123456;
		carro.nomenclatura = "Car";
		carro.descricao = "Carro de luxo";
		carro.quantidade = 2;
		

		System.err.println();
		System.out.println("O idProduto é " + carro.idProduto);
		System.out.println("A nomenclatura é " + carro.nomenclatura);
		System.out.println("O descricao é " + carro.descricao);
		System.out.println("A quantidade é " + carro.quantidade);
		
	}

}
