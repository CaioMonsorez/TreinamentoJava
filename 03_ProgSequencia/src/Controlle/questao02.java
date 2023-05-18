package Controlle;

import util.Teclado;

public class questao02 {
	/*Elaborar um programa que pergunte quatro valores inteiros e apresente 2 resultados:
a) Resultado de suas adições
b) Resultado de suas multiplicações
	 * 
	 */

	public static void main(String[] args) {
	
		int valor1, valor2, valor3, valor4, adicao, multiplicacao;
		
		valor1 = Teclado.lerInt("informe valor 1: ");
		valor2 = Teclado.lerInt("informe valor 2: ");
		valor3 = Teclado.lerInt("informe valor 3: ");
		valor4 = Teclado.lerInt("informe valor 4: ");
		
		adicao = valor1 + valor2 + valor3 + valor4;
		
         multiplicacao = valor1 * valor2 * valor3 * valor4;
		
		System.out.println("valor da adição é: " + adicao);
		System.out.println("valor da multiplicação é: " + multiplicacao);
		
	}

}
