package controller;

import util.Teclado;

public class Exemplo {

	public static void main(String[] args) {
		
		String nome;
		int num;
		
		nome = Teclado.lerTexto("Qual seu nome? ");
		num = Teclado.lerInt("Informe um numero: ");
		
		System.out.println("Olá, " + nome +"!!");
		System.out.println("O numero informado foi:" + num);
	}

}
