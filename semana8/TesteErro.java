package semana8;

public class TesteErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vet = new int [4];
		
		//tratamento de erro
		try{
		vet[4] = 9;
		System.out.println("Fim de Programa!");
		}
		catch(Exception e){
			
			System.out.println("Erro ao acesar o vetor, verifique");
		}
		
		
		
		
	}

}
// pesquisar try catch(exception)
