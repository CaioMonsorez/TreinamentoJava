package controller;

public class aula1 {

	public static void main(String[] args) {
		
		double salario;
		String name;
		int idade, val1, val2;
		boolean casado = true;
		double x, y, p, t;
		
		
		salario = 29;
		name = "Caio Monsores";
		idade = 33;
		val1 = 100;
		val2 = 20;
		
		x = val1 + val2;
		y = val1 / val2;
		p = val1 - val2;
		t = val1 * val2;
		
		System.out.println("Seu nome " + name);
		System.out.println("Seu salário é " + salario);
		System.out.println("Sua idade " + idade);		
		System.out.println("Estado civil " + casado);
		
		System.out.println("o valor de é " + (val1 + val2));// TODO Auto-generated method stub
		System.out.println("o valor de x é " + x);
		System.out.println("o valor de y é " + y);
		System.out.println("o valor de p é " + p);
		System.out.println("o valor de t é " + t);

	}

}
