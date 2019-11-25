package controller;

import java.util.ArrayList;
import java.util.List;

import dao.VooDAO;
import model.Voo;

public class VooController {
	

	public int create(Voo voo){
		
		try{
			VooDAO dao = new VooDAO();
			dao.create(voo);
			return 1;
		}
		finally{
			System.out.println("Fim da inserção!");
		}
			
	
	}
	
	
	
public int delete(Voo voo){
		
		try{
			VooDAO dao = new VooDAO();
			dao.delete(voo);
			return 1;
		}
		finally{
			System.out.println("Voo deletado!");
		}
			
	}

public int update(Voo voo){
	
	try{
		VooDAO dao = new VooDAO();
		dao.update(voo);
		return 1;
	}
	finally{
		System.out.println("Fim da atualização!");
	}
		
}

}
