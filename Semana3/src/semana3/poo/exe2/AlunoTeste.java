package semana3.poo.exe2;

import java.util.Scanner;

public class AlunoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		Scanner ler = new Scanner(System.in);
		
		String mat , nome , curso;
		
		System.out.println("Matricula: ");
		mat = ler.next();
		
		System.out.println("Nome: ");
		nome = ler.next();
		
		System.out.println("Curso: ");
		curso = ler.next();
		
		
		aluno.setMatricula(mat);
		aluno.setNome(nome);
		aluno.setCurso(curso);
		
		aluno.listar();
		

	}

}
