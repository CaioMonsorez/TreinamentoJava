package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {

		//CONSTRUTOR SIMPLES
		Carro uno = new Carro(); 
		uno.setFabricante("FIAT");
		uno.setModelo("Uno Mille");
		uno.setAno(2015);
		uno.setMotorLigado(false);
		uno.setVelocidade(0);
		
		
		//CONSTRUTOR COMPLETO
		Carro gol = new Carro("VW", "turbo", 2020, true, 70);
		
		System.out.println();
		System.out.println("Fabricate: " + uno.getFabricante());
		System.out.println("Modelo: " + uno.getModelo());
	
		System.out.println("Fabricate: " + gol.getFabricante());
		System.out.println("Modelo: " + gol.getModelo() + "\n");
		
		//CONSTRUTOR PERSONALIZADO - SEGUNDO SLIDE
		Carro ka = new Carro("Ford","KA SEDAN", 2019);
	
		System.out.println();
		System.out.println("Fabricate: " + ka.getFabricante());
		System.out.println("Modelo: " + ka.getModelo());
		System.out.println("Motor Ligado: " + ka.isMotorLigado());
		System.out.println("Velocidade: " + ka.getVelocidade());
		
		
		
		//METODO TERCEIRO SLIDE PUBLIC VOID
		
		uno.detalhes();
		gol.detalhes();
		ka.detalhes();

		
		//METODO QUARTO SLIDE PUBLIC STRING | NECESSARIO CRIAR STRNG PARA RECEBER O VALOR
		String texto;
		texto = uno.situacaoMotor();
		System.out.println(texto);;
	
		//ou
		
		System.out.println(gol.situacaoMotor());
		System.out.println(ka.situacaoMotor());
		
		//METODO QUINTO SLIDE
		System.out.println(uno.ligarMotor());
		System.out.println(uno.situacaoMotor());

			
		}

}
	


