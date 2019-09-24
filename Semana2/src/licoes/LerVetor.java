package licoes;

import java.util.Scanner;

public class LerVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int [5];
		int i;
		
		for(i=0; i<5; i++)
		{
			System.out.println("Entre com aluno" + (i+1));
			num[i] = input.nextInt();
		}
		
		// calule o maior numero lido
		int maior = 0;
		for (i=0; i<5; i++)
		{
			if(num[i] > maior){
				maior = num[i];
			}
		}
		System.out.println("Maior numero = " + maior);

	}

}
