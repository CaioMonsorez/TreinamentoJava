package model;

public class Carro extends Veiculo implements Imprimivel{
	
	private int quantidadePortas;

	
	
	@Override
	public void imprimir() {
		System.out.println("Marca: " + super.getMarca());
		System.out.println("Ano de Fabricação: " + super.getAnoFabricacao());
		System.out.println("Quantidade de Portas " + this.getQuantidadePortas());
	}
	
	
	
	public Carro() {
		super();
	}

	public Carro(String marca, int anoFabricacao, int quantidadePortas) {
		super(marca, anoFabricacao);
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	
	


}
