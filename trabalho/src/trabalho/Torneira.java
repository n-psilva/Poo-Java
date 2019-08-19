package trabalho;

public class Torneira {
	
		String modelo;
		String cor;
		String tipo;
		boolean aberta;
		
		void lavar(){
			if(aberta){
				System.out.println("Lavar mão");
			}else{
				System.out.println("Torneira fechada");
			}
		}
		
		void abrir(){
			aberta= true;
		}
		
		void fechar(){
			aberta= false;
		}


}
