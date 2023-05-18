package controller;

import model.Cliente;

public class CadastroClientes {

	public static void main(String[] args) {
		
		//Instanciando objetos de clientes
		
		Cliente c1 = new Cliente(); //deu erro pq ja existe o metodo construtor no model. Precisa criar no model um metodo ou funcao vazia. Esse metodo é mais trabalhoso pois 
		//precisa preencher um por um;
		
		//inserindo dados nos atributos do objeto c1
		c1.setNome("Claudia Ribeiro");
		c1.setDataNascimento("25/04/2000");
		c1.setRg(5589);
		
		
		
		//instanciando objeto de Cliente pelo outro metod construtor
		Cliente c2 = new Cliente("Carlos Pereira" , "15/12/1999", 123454);
		c2.setNome("Carla"); // alterando nome
		
		System.out.println("c2 Nome:" + c2.getNome()); //metodo que traz valor privado;
		
		
		Cliente c3 = new Cliente("Francisco Nogueira", 789456);
		c3.setDataNascimento("18/12/2002"); //caso criar sem a data, pode colocar depois dessa forma
	}

}
