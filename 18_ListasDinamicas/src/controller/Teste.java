package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class Teste {

	public static void main(String[] args) {

		
		Usuario u1 = new Usuario("Aline", "a123"); //ctrl shift o para importar o model
//		System.out.println(u1);
		
		List<Usuario> usuarios = new ArrayList <Usuario>();//ctrl shift o para importar o Arraylist
		usuarios.add(u1);
		usuarios.add(new Usuario ("fabs", "f123"));
		usuarios.add(new Usuario ("jorge", "J456"));
		usuarios.add(new Usuario ("leo", "4572"));
		
		System.out.println(usuarios.get(2));//colocar o indice vai puxar o objeto da posicao 2 da lista
		System.out.println(usuarios);
		
		usuarios.remove(1);
		System.out.println(usuarios.get(2));
		
		
	}

}
