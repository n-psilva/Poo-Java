package semana3.poo.exe1;

public class Caneta {
	
	private String modelo;
	private String cor;
	private float ponta;
	private int carga;
	private boolean tampada;
	
	public Caneta(){
		
		this.cor = "Azul";
	}
	
	public Caneta(String cor){
		
		this.cor = cor;
	}
	
	/*public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}*/

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public void setModelo(String modelo){
		
		this.modelo = modelo;
	}
	
	public String getModelo(){
		
		return this.modelo;
	}
	
	public void escrever(){
		
		if(tampada){
			System.out.println("Erro não consigo escrever");
		}
		else{
			System.out.println("escrevendo..");
		}
	}
	
	public void tampar(){
		
		this.tampada = true;
	}
	
	public void destampar(){
		
		this.tampada = false;
	}
	
	public void listar(){
		
		System.out.println("Modelo = " + this.modelo);
		System.out.println("Cor = " + this.cor);
		System.out.println("Ponta = " + this.ponta);
		System.out.println("Carga = " + this.carga);
	}

}
