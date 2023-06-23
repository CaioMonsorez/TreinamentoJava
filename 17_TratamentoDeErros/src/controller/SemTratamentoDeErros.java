package controller;

import util.Teclado;

public class SemTratamentoDeErros {

	public static void main(String[] args) {
		
		double a = Teclado.lerDouble("Digite um numerador");
		double b = Teclado.lerDouble("Digite um numerador");
		double c = a/b;
		System.out.println("Resultado da divisao de a por b:" + c);
	}

}
