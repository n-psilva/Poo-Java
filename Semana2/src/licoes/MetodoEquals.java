package licoes;

import java.util.Scanner;

public class MetodoEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome1, nome2;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println(" Entre com o nome1: ");
		nome1= entrada.next();
		System.out.println(" Entre com o nome2: ");
		nome2= entrada.next();
		
		
		if(nome1.equals(nome2))
			System.out.println("nomes iguais.");
		else
			System.out.println("nomes diferentes.");

	}

}
