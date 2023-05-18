package Controlle;

import util.Teclado;

public class Exemplo01 {
	
	/*
	 * Elabore um programa que pergunte ao usuario o seu nome e as suas duas notas
	 * em seguida, o programa devera calcular a média do aluno e apresentar um relatorio contendo o nome do aluno,
	 * as suas duas notas e média.
	 */

	public static void main(String[] args) {
		
		//Declaração das variáveis
		String nome;
		double nota1, nota2, media;
		
		//Entrada de dados
		nome = Teclado.lerTexto("informe seu nome: ");
		nota1 = Teclado.lerDouble("informe sua primeira nota: ");
		nota2 = Teclado.lerDouble("informe sua segunda nota: ");

		//Processamento de dados
		media = (nota1 + nota2) / 2;
		
		//saida de dados
		System.out.println("nome: " + nome);
		System.out.println("nota 1: " + nota1);
		System.out.println("nota2: " + nota2);
		System.out.println("media: " + media);
		
		
	}

}
