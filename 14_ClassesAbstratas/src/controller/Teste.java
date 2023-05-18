package controller;

import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {

		//instanciar objeto
		//ctrl shift O para trazer o import
		Aluno a1 = new Aluno(); 
		a1.setLogin("joao123");
		a1.setSenha("abc123");
		a1.setTipo(1);
		a1.setMatricula(1001);
		a1.setNome("Joao da Silva");
		a1.setTurno("n");
		a1.setTurma("TI2023-1");
		
		Professor p1 = new Professor("PRFAvila", "av123", 2, 352, "Wellington Avila", "T.I.");
		
//		Usuario u1 = new Usuario("Ana123", "ana123", 0); // nao pode instanciar pois é clase abstrata
//		
		a1.exibirDados();
		p1.exibirDados();
//		u1.exibirDados();
	}
}
