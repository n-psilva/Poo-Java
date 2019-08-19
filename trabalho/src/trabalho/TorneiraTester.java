package trabalho;

public class TorneiraTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Torneira t = new Torneira();
		t.modelo = "Bancada";
		t.cor = "Prata";
		t.tipo = "Sem filtro";
		t.aberta = true;
		
		
		t.fechar();
		t.lavar();
		t.abrir();
		t.lavar();
		

	}

}
