package licoes;

import java.util.Scanner;

public class saudacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String nome;
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		nome = ent.next();
		
		System.out.println("Boa noite " + nome + "!");

	}

}
