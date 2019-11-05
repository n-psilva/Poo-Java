package com.poo.view;

import java.util.Scanner;

import com.poo.controller.AlunoController;
import com.poo.model.Aluno;

public class AlunoView {

	public void create(){
		
		try{
			
			Scanner sc = new Scanner(System.in);
			Aluno aluno = new Aluno();
			AlunoController control = new AlunoController();
			
			System.out.println("Entre com a matricula: ");
			aluno.setMatricula(sc.nextLine());
			
			System.out.println("Entre com o nome: ");
			aluno.setNome(sc.nextLine());
			
			control.create(aluno);
			
			}
			catch(Exception e){
				
				System.out.println("Erro na tela de incluir aluno.");
			}
	}
	
	public void readAll(){
		
		AlunoController control = new AlunoController();
		
		System.out.println("Listagem de Alunos");
		System.out.println("*******************");
		for (Aluno aluno:control.readAll()){
			
			System.out.println("Matricula:" + aluno.getMatricula());
			System.out.println("NOme:" + aluno.getNome());
			System.out.println("-------------------------");
			
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlunoView crud = new AlunoView();
		//crud.create();
		crud.readAll();

	}

}
