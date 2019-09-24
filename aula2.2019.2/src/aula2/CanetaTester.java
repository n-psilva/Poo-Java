package aula2;

public class CanetaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta c1;
		
		c1 = new Caneta();
		c1.cor = "vermelho";
		c1.tampada = false;
		c1.modelo = "Bic";
		c1.ponta = 0.5f;
		c1.carga = 90;
		c1.status();
		c1.rabiscar();
		c1.tampar();
		c1.rabiscar();
		
		
		Caneta c2;
		
		c2 = new Caneta();
		c2.cor = "verde";
		c2.tampada = true;
		c2.modelo = "Compactor";
		c2.status();
		c2.rabiscar();

	}

}
