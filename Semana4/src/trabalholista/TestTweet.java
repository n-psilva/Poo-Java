package trabalholista;

import java.util.Scanner;

public class TestTweet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		String resp;
		Usuario us = new Usuario();
		Tweet twe = new Tweet();
		
		
		System.out.println("Login: ");
		us.setLogin(ler.next());
		System.out.println("Senha: ");
		us.setSenha(ler.next());
		
		if(us.getSenha().equals("poo")){
			
			int aux = 1;
			while(aux == 1){
				
				System.out.println("Entre com o tweet: ");
				twe.setDescricao(ler.next());
				
				System.out.println("Dejesa continuar?");
				resp = ler.next();
				if(!resp.equalsIgnoreCase("sim")){
					aux = 0;
					
				}
				
				
			}
			
			us.ListarTweet();
			
			ler.close();
			
		}
		
		else
			System.out.println("Senha incorreta!");

		
		
		
		
		
	}

}
