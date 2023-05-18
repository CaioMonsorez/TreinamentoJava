package controller;

public class ExemploTypeCast {
 //CUIDADO PARA NAO ATRIBUIR TIPOS PRIMITIVOS DIFERENTES NAS VARIAVEIS 
	//Java não faz conversão implícita quando um tipo não “cabe” no outro.
	//A conversão deve ser explícita.
	
	public static void main(String[] args) {
	 
		int a = 5, b =2;
		int c;
		
		c = a / b;

		System.out.println("Valor de C: " + c);

		double d;
		d = a / b;
		System.out.println("Valor de d: " + d);
		
		double e;
		//conversao explicita
		e = (double) a / b;
		System.out.println("\n\nValor de e: " + e);
		
		float f = 14.5f;
		//conversao implcita
		e = f;
		System.out.println("Valor de e: " + e);
		
	}

}
