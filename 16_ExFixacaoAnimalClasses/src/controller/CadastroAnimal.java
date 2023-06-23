package controller;

import model.Animal;
import model.Mamifero;
import model.Reptil;

public class CadastroAnimal {

	public static void main(String[] args) {
/*
 * 2 – Crie no pacote controller a Classe CadastroAnimal e instancie os seguintes objetos:
• jacare: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, não possui
capacidade regenerativa.

• lagartixa: réptil de 4 patas, coberto por escamas, reprodução tipo ovíparo, alimentação carnívoro, possui
capacidade regenerativa.

• cachorro: mamífero de 4 patas, coberto por pelos, reprodução tipo vivíparo, alimentação carnívoro, habitat
terrestre.

• baleia: mamífero sem patas, coberto por pele, reprodução tipo vivíparo, alimentação carnívoro, habitat
aquático.
 */
		Animal jacare = new Reptil();
		jacare.setNomenclatura("Jacare");
		jacare.setNumeroDePatas(4);
		jacare.setCobertoPor("Escamas");
		jacare.setReproducao("Oviparo");
		jacare.setAlimentacao("Carnivoro");
		jacare.setCapacidadeRegenerativa(false);
		
		Animal lagartixa = new Reptil("Lagartixa",4,"Escamas","Oviparo","Carnivoro", true);
		Animal cachorro = new Mamifero("Cachorro", 4, "Pelos","Viviparo", "carnivoro", "Terrestre");
		Animal baleia = new Mamifero("Baleia", 0, "Pele", "Viviparo", "Carnivoro", "Aquatico");
		
		cachorro.tipoDeRespiracao();
		baleia.tipoDeRespiracao();
		jacare.tipoDeRespiracao();
		lagartixa.tipoDeRespiracao();
		
		jacare.exibir();
		lagartixa.exibir();
		cachorro.exibir();
		baleia.exibir();
		
	}

}
