package model;

public class Carro {
	
	// no diagrama de classe o - significa private e o + significa public
	// - private
	// + public
	
	private String fabricante;
	private String modelo;
	private int ano;
	private boolean motorLigado;
	private int velocidade;
	
	
	
	//slide 3 
	//DETALHES
	//void é yum metodo q nao d retorno. faz oq tem q fazer e acaba
	public void detalhes() {
		//existem duas formas de chamar 
		System.out.println("Fabricante:" + this.fabricante);//ou
		System.out.println("Fabricante:" + getFabricante() + "\n");
		System.out.println("Modelo: " + this.ano ); //ou
		System.out.println("Modelo: " + getAno()+"\n");
		
	};
	
	//slide 4 
	// SITUACAO MOTOR
	public String situacaoMotor() {
		if (this.motorLigado == true) {
			return this.modelo + " --> Motor LIGADO";
		} else {
			return this.modelo + " --> Motor DESLIGADO";
		}
	};
	
	//SLIDE 5
	//LIGAR MOTOR
	public String ligarMotor() {
		if (this.motorLigado == true) {
			return "O motor do " + this.modelo + "ja estava ligado";
		} else {
			this.motorLigado = true; //ligando o motor
			return "O motor do " + this.modelo + "foi ligado agora";
		}
	}
	
	/**metodo construtor permite criar objetos
	 * 
	 * 
	 * 	metodo CONSTRUTOR SIMPLES nao tem atributo. 
	 * 	clicar em source / criat generetate fields // desmarcar os atributos
	 * abaixo metodo construtor simples
	 **/
	
	public Carro() {
		super();
	}
	
		/*metodo CONSTRUTOR COMPLETO tem atributo. 
		clicar em source / criat generetate fields // marcar os atributos
		abaixo metodo construtor COMPLETO
		*/
	// primeirp slide
	public Carro(String fabricante, String modelo, int ano, boolean motorLigado, int velocidade) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = motorLigado;
		this.velocidade = velocidade;
	}

	//METODO CONSTRUTOR PERSONALIZADO - SEGUNDO SLIDE
	public Carro(String fabricante, String modelo, int ano) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.motorLigado = false;
		this.velocidade = 0;
	}
	
	/**manipular getter e setter pois os atributos sao privates
	 * clicar em source | generate getter e setter
	 * 
	 */
	
	
	public String getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public boolean isMotorLigado() {
		return motorLigado;
	}
	
	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	} 
	 
	
	
	
}
