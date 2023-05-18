package controller;

public class SobrecargaMetodo {
	
	//variavel global
	
	int idade;
	String nome;

	public static void main(String[] args) {
		
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(58);
		scm.cadastrarPessoa("jorge");
		scm.cadastrarPessoa(50,"Caio");

		
	}//fim do metodo main
	
	public void cadastrarPessoa(int valor) {
		
		idade = valor;
		System.out.println("idade:" + idade);
	}
	
	public void cadastrarPessoa(String valor) {
		
		nome = valor;
		System.out.println("idade:" + nome);
	}
	
	public void cadastrarPessoa(int valor1, String valor2) {
		
		idade = valor1;
		nome = valor2;
		System.out.println("idade:" + idade + "-Nome:" + nome);
	}

}//fim da classe
