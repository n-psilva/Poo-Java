package licoes;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, soma;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o num1: ");
		n1 = entrada.nextInt();
		
		System.out.println("Entre com o num2: ");
		n2 = entrada.nextInt();
		
		soma= n1 + n2;
		
		System.out.println("A soma de " + n1 + " + " + n2 + "=" + soma);

	}

}
