package controller;

import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		
		user.nome="Lucas Silva";
		user.endereco="Rua 13, 18";
		user.telefone="(21) 9999-9999";

		System.out.println("Nome: " + user.nome);
		System.out.println("Endereço: " + user.endereco);
		
		
		Usuario joao = new Usuario();
		
		joao.nome="João da Silva Sauro";
		joao.endereco="Rua Sem Fim, 72";
		
		System.out.println("Nome: " + joao.nome);
		System.out.println("Endereço: " + joao.endereco);
		
		Usuario lucas = new Usuario();
		
		lucas.nome="Lucas Silva";
		lucas.endereco="Rua 13, 18";
		lucas.telefone="(21) 9999-9999";

		
		System.out.println("Nome: " + lucas.nome);
		System.out.println("Endereço: " + lucas.endereco);
		
	}

}
