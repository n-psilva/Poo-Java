package semana3.poo.exe1;

public class CanetaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta caneta = new Caneta("Vermelho");
		
		//caneta.modelo = "Bic";
		caneta.setModelo("Bic");
		//caneta.cor = "verde";
		//caneta.setCor("Verde");
		//caneta.ponta = 0.5f;
		caneta.setPonta(0.5f);
		//caneta.carga = 50;
		caneta.setCarga(50);
		//caneta.tampada = true;
		
		caneta.destampar();
		caneta.escrever();
		
		caneta.tampar();
		caneta.escrever();
		
		caneta.listar();
		
		

	}

}
