package controller;

	
import java.util.ArrayList;
import java.util.List;

import dao.AeroportoDAO;
import model.Aeroporto;

public class AeroportoController {
		

		public int create(Aeroporto aeroporto){
			
			try{
				AeroportoDAO dao = new AeroportoDAO();
				dao.create(aeroporto);
				return 1;
			}
			finally{
				System.out.println("Fim da inserção!");
			}
				
		}
		
		
		
	public int delete(Aeroporto aeroporto){
			
			try{
				AeroportoDAO dao = new AeroportoDAO();
				dao.delete(aeroporto);
				return 1;
			}
			finally{
				System.out.println("Aeroporto deletado!");
			}
				
		}

	public int update(Aeroporto aeroporto){
		
		try{
			AeroportoDAO dao = new AeroportoDAO();
			dao.update(aeroporto);
			return 1;
		}
		finally{
			System.out.println("Fim da atualização!");
		}
			
	}

}
