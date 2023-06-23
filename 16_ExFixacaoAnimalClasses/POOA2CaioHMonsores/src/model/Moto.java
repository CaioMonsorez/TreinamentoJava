package model;

public class Moto extends Veiculo implements Imprimivel {
	
	private int cilindradas;

	
	
	@Override
	public void imprimir() {
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Ano de Fabricação: " + super.getAnoFabricacao());
		System.out.println("Cilindradas " + this.getCilindradas());		
	}
	
	
	
	public Moto() {
		super();
	}

	public Moto(String marca, int anoFabricacao, int cilindradas) {
		super(marca, anoFabricacao);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	
	
	

}
