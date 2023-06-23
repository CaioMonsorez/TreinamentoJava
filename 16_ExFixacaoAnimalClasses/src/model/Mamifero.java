package model;

public class Mamifero extends Animal implements IAnimal {
	
	private String habitat;
	
	@Override //Implements  abstract
	public void exibir() {
		System.out.println("\n ----mamifero-----");
		System.out.println("Nomenclatura " + super.getNomenclatura());
		System.out.println("Numero de Patas " + super.getNumeroDePatas());
		System.out.println("Coberto por " + super.getCobertoPor());
		System.out.println("Reproducao " + super.getReproducao());
		System.out.println("Alimentacao " + super.getAlimentacao());
		System.out.println("Habitat " + this.habitat);
		temperaturaCorporal();
		tipoDeRespiracao();

		
	}
	@Override //polimorfismo, sobrescreve o metodo da herança Animal
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Pulmonar");
		
	}
	
	
	
	//impelementes interface
	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal :Homeotermico");
	}
	
	//metodos e construtores
	public Mamifero() {
		super();
	}

	public Mamifero(String nomenclatura, int numeroDePatas, String cobertoPor, String reproducao, String alimentacao,
			String habitat) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.habitat = habitat;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}









		
	
}
