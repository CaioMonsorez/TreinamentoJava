package controller;

import model.Funcionario;

public class CadastroFuncionario {

	public static void main(String[] args) {
		
		Funcionario eduardo = new Funcionario();
		
		eduardo.matricula = 123;
		eduardo.nome = "Eduardo da Silva Sauro";
		eduardo.cpf = "123-456-78";
		
		System.err.println();
		System.out.println("A matricula é " + eduardo.matricula);
		System.out.println("O nome do Funcionario é " + eduardo.nome);
		System.out.println("O cpf é " + eduardo.cpf);
		
		Funcionario joao = new Funcionario();
		
		joao.matricula = 134;
		joao.nome = "Joao Costa Lima";
		joao.cpf = "456.987-94";
		
		System.err.println();
		System.out.println("A matricula é " + joao.matricula);
		System.out.println("O nome do Funcionario é " + joao.nome);
		System.out.println("O cpf é " + joao.cpf);
		
		Funcionario caio = new Funcionario();
		
		caio.matricula = 565;
		caio.nome = "Caio Monsores";
		caio.cpf = "123.545-98";
		
		System.err.println();
		System.out.println("A matricula é " + caio.matricula);
		System.out.println("O nome do Funcionario é " + caio.nome);
		System.out.println("O cpf é " + caio.cpf);
		
		Funcionario bruna = new Funcionario();
		bruna.matricula = 875;
		bruna.nome = "Bruna Rosa";
		bruna.cpf = "456.255-96";
	}

}
