package controller;

import util.Teclado;

public class Exercicio2 {
	/*
	 * Elaborar um programa que pergunte quatro valores inteiros e apresente 2
	 * resultados: Resultado de suas adições, Resultado de suas multiplicações
	 */

	public static void main(String[] args) {
		//variavel
		int N1, N2, N3, N4, soma, multi;
		
		//entrada de dados
		N1 = Teclado.lerInt("Informe o primeiro número: ");
		N2 = Teclado.lerInt("Informe o segundo número: ");
		N3 = Teclado.lerInt("Informe o terceiro número: ");
		N4 = Teclado.lerInt("Informe o quarto número: ");
		
		//processamento
		soma = N1 + N2 + N3 + N4;
		multi = N1 * N2 * N3 * N4;
		
		//saida
		System.out.println("A soma dos números informados: " + soma);
		System.out.println("A multiplicação dos números informados: " + multi);
		

	}

}
