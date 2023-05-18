package controller;

import util.Teclado;

public class exercicio1 {
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu
	 * sexo. Em seguida, o programa deve apresentar os dados anteriormente
	 * informados.
	 */

	public static void main(String[] args) {

		// variavel
		String nome, sexo;
		// entrada de dados
		nome = Teclado.lerTexto("Informe o seu nome completo: ");
		sexo = Teclado.lerTexto("Informe o seu sexo: ");
		// processamento
		
		// saida
		System.out.println("O nome informado foi: " + nome + " e o sexo informado foi: " + sexo);
	}

}
