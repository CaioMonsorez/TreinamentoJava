package model;

public abstract class Veiculo {
	
	private String marca;
	private int anoFabricacao;
	
	
	
	
	
	
	
	
	
	
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String marca, int anoFabricacao) {
		super();
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
