package controller;

import util.Teclado;

public class ComTratamentoDeErros {

	public static void main(String[] args) {
		
		
		try {
			
			double a = Teclado.lerDouble("Digite um numerador");
			double b = Teclado.lerDouble("Digite um numerador");
			double c = a/b;
			System.out.println("Resultado da divisao de a por b:" + c);
//			main(args);//recomeça o programa

			
		} catch( NumberFormatException erro ) {
			System.out.println(" Deu erro! Por favor, digite um numero ");
			System.out.println(" O Erro encontrado foi: " + erro);
			System.out.println("\n------ RECOMEÇANDO O PROGRAMA------" );
			main(args); //recomeça o programa
		
		} finally {
			System.out.println("\n------Fim do programa");	
			
		}
	}

}
