package model;

public class Caminhao extends Veiculo implements Imprimivel {
	
	private int capacidadeCarga;


	
	@Override
	public void imprimir() {
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Ano de Fabricação: " + super.getAnoFabricacao());
		System.out.println("Capacidade de Carga " + this.getCapacidadeCarga());		
	}
	
	
		
	public Caminhao() {
		super();
	}

	public Caminhao(String marca, int anoFabricacao, int capacidadeCarga) {
		super(marca, anoFabricacao);
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	
	

}
