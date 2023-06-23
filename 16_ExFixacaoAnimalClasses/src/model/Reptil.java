package model;

public class Reptil extends Animal implements IAnimal{

	private boolean capaidadeRegenerativa;

	
	
	@Override 	//Implements  abstract

	public void exibir() {
		System.out.println("\n ----Reptil-----");
		System.out.println("Nomenclatura " + super.getNomenclatura());
		System.out.println("Numero de Patas " + super.getNumeroDePatas());
		System.out.println("Coberto por " + super.getCobertoPor());
		System.out.println("Reproducao " + super.getReproducao());
		System.out.println("Alimentacao " + super.getAlimentacao());
		System.out.println("Capacidade Regeneratia " + this.capaidadeRegenerativa);//brncar com verdadeiro ou false com IF
		temperaturaCorporal();
		tipoDeRespiracao();
		
	}
	
	@Override //polimorfismo, sobrescreve o metodo da herança Animal
	public void tipoDeRespiracao() {
		super.tipoDeRespiracao();
		System.out.println("Traquial");
		
	}
	
	
	//Implements Interface
	@Override
	public void temperaturaCorporal() {
		System.out.println("Temperatura corporal :Peciloetermico");		
	}
	
	
	//metodos e construtores

	
	public Reptil() {
		super();
	}

	public Reptil(String nomenclatura,
			int numeroDePatas, 
			String cobertoPor, 
			String reproducao, 
			String alimentacao,
			boolean capaidadeRegenerativa) {
		super(nomenclatura, numeroDePatas, cobertoPor, reproducao, alimentacao);
		this.capaidadeRegenerativa = capaidadeRegenerativa;
	}

	public boolean isCapaidadeRegenerativa() {
		return capaidadeRegenerativa;
	}

	public void setCapaidadeRegenerativa(boolean capaidadeRegenerativa) {
		this.capaidadeRegenerativa = capaidadeRegenerativa;
	}






	
	
	
}
