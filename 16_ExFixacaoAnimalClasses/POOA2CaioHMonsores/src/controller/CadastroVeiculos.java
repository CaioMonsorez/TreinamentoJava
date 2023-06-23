package controller;

import model.Caminhao;
import model.Carro;
import model.Moto;
import model.Veiculo;

public class CadastroVeiculos {

	public static void main(String[] args) {
		Carro carro1 = new Carro ("VW Fusca", 1980, 2);
		Caminhao caminhao1 = new Caminhao ("Volvo FH 540", 2023, 100);
		Moto moto1 = new Moto ("Honda CBR", 2023, 1000);
		
		carro1.imprimir();
		caminhao1.imprimir();
		moto1.imprimir();

	}

}
