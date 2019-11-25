package controller;


import java.util.ArrayList;
import java.util.List;

import dao.AviaoDAO;
import model.Aviao;

public class AviaoController {
		

		public int create(Aviao aviao){
			
			try{
				AviaoDAO dao = new AviaoDAO();
				dao.create(aviao);
				return 1;
			}
			
			finally{
				System.out.println("Fim da inserção!");
			}
				
		}
		
		
	public int delete(Aviao aviao){
			
			try{
				AviaoDAO dao = new AviaoDAO();
				dao.delete(aviao);
				return 1;
			}
			finally{
				System.out.println("Aviao deletado!");
			}
				
		}

	public int update(Aviao aviao){
		
		try{
			AviaoDAO dao = new AviaoDAO();
			dao.update(aviao);
			return 1;
		}
		finally{
			System.out.println("Fim da atualização!");
		}
			
	}
}

