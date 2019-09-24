package aula2;

public class Caneta {
	
	//atributos
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void rabiscar(){
		if(tampada){
			System.out.println("Erro! Caneta tampada.");
		}
		else{
			System.out.println("Rabisco");
		}
			
	}
	
	void tampar(){
		tampada = true;
		
	}
	void destampar(){
		tampada = false;
		
	}
	void status(){
		System.out.println("Classe Caneta");
		System.out.println("Modelo " + modelo);
		System.out.println("Cor " + cor);
		System.out.println("Ponta " + ponta);
		System.out.println("Carga " + carga + "%");
		System.out.println("Tampada : " + tampada);
	}

}
