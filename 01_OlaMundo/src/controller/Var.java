package controller;

public class Var {

	public static void main(String[] args) {
		// tipo de variaveis Java para as aulas de lógica:
		
		// criando variáveis
		String nome; // alfanuméricos
		int numero, numero2, soma; // números inteiros
		double salario; // números reais
		
		nome = "craudin";
		numero = 100;
		salario = 9500.50;
		
		System.out.println("o valor salvo na var nome é " + nome);
		System.out.println("o var número contém " + numero);
		System.out.println("o meu salario é " + salario);
		
		numero2 = 200;
		soma = numero + numero2;
		System.out.println("a soma do n1 e n2 é " + soma);
		
	}

}
