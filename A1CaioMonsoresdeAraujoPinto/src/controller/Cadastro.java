package controller;

import model.Responsavel;

public class Cadastro {

	public static void main(String[] args) {

		Responsavel Pessoa = new Responsavel();
		Pessoa.setCnh (222222);
		Pessoa.setDataNascimento("29-08-1990");
		Pessoa.setNome("Caio");
		
		Responsavel Pessoa2 = new Responsavel(45345345, "Fernanda","29-08-1998");
		System.out.println("O Cnh: " + Pessoa2.getCnh());
		System.out.println("Data de Nascimento: " + Pessoa2.getDataNascimento());
		System.out.println("Responsavel: " + Pessoa2.getNome());

		
		
		System.out.println(Pessoa2.validarCnh(45345345));
		
		String valor;
		valor = Pessoa.validarCnh(555);
		System.out.println(valor);
		
		System.out.println(Pessoa.validarCnh(555));
		

	}
	

}
