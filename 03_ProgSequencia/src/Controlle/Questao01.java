package Controlle;

import util.Teclado;

public class Questao01 {
	/*
	 * Desenvolver um programa que pergunte ao usuário o seu nome completo e seu sexo. Em seguida, o programa
deve apresentar os dados anteriormente informados.
	 */

	public static void main(String[] args) {
		String nome, sexo;
		int idade;
		
		
		nome = Teclado.lerTexto("informe seu nome: ");
		sexo = Teclado.lerTexto("informe seu sexo: ");
		idade = Teclado.lerInt("informe sua idade: ");
		
		
		System.out.println("nome: " + nome);
		System.out.println("sexo: " + sexo);
		System.out.println("idade: " + idade);
		
		

	}

}
