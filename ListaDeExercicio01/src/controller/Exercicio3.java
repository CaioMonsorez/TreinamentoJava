package controller;

import util.Teclado;

public class Exercicio3 {
	/*
	 * Fazer um programa que pergunte um valor em Dólares e apresente o equivalente
	 * em Reais. Considere U$1,00 = R$5,42.
	 */

	public static void main(String[] args) {
		//variavel
		double dollar, real;
		
		//entrada de dados
		dollar = Teclado.lerDouble("Informe o valor em Dólares: ");
		
		//processamento
		real = dollar * 5.42;
		
		//saida
		System.out.println("O valor em Reais é: R$ " + real);
		
	}

}
