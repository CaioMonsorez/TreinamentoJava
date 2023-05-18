package controller;

import model.Produto;

public class CadastroProduto {

	public static void main(String[] args) {
		
		Produto carro = new Produto();
		carro.idProduto = 123456;
		carro.nomenclatura = "Car";
		carro.descricao = "Carro de luxo";
		carro.quantidade = 2;
		

		System.err.println();
		System.out.println("O idProduto é " + carro.idProduto);
		System.out.println("A nomenclatura é " + carro.nomenclatura);
		System.out.println("O descricao é " + carro.descricao);
		System.out.println("A quantidade é " + carro.quantidade);
		
		
		Produto moto = new Produto();
		moto.idProduto = 123456;
		moto.nomenclatura = "moto";
		moto.descricao = "moto de luxo";
		moto.quantidade = 2;
		

		System.err.println();
		System.out.println("O idProduto é " + moto.idProduto);
		System.out.println("A nomenclatura é " + moto.nomenclatura);
		System.out.println("O descricao é " + moto.descricao);
		System.out.println("A quantidade é " + moto.quantidade);
		
		
		Produto bicicleta = new Produto();
		bicicleta.idProduto = 123456;
		bicicleta.nomenclatura = "moto";
		bicicleta.descricao = "bicicleta de luxo";
		bicicleta.quantidade = 2;
		

		System.err.println();
		System.out.println("O idProduto é " + bicicleta.idProduto);
		System.out.println("A nomenclatura é " + bicicleta.nomenclatura);
		System.out.println("O descricao é " + bicicleta.descricao);
		System.out.println("A quantidade é " + bicicleta.quantidade);

	}

}
