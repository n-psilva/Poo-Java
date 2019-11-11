package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class AlunoController {

	public void create(Aluno aluno){
		
		try{
			AlunoDAO dao = new AlunoDAO();
			dao.create(aluno);
		}
		finally{
			System.out.println("Fim da inserção!");
		}
			
	}
	
	public List<Aluno> readAll(){
		
		List<Aluno> alunos = new ArrayList<>();
		
		try{
			AlunoDAO dao = new AlunoDAO();
			alunos = dao.readAll();
		}
		finally{
			System.out.println("Fim da leitura!");
		}
		
		return alunos;
	}
	
public void delete(Aluno aluno){
		
		try{
			AlunoDAO dao = new AlunoDAO();
			dao.delete(aluno);
		}
		finally{
			System.out.println("Aluno deletado!");
		}
			
	}

public void update(Aluno aluno){
	
	try{
		AlunoDAO dao = new AlunoDAO();
		dao.update(aluno);
	}
	finally{
		System.out.println("Fim da atualização!");
	}
		
}

	
	
}
