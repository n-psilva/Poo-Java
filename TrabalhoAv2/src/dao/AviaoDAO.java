package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Aviao;


public class AviaoDAO {
		
		public void create(Aviao aviao)
		{

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aviao(idAviao, modelo, Qtd_vagas) values ( ?,?,?)";
		
		try {
			stmt = con.prepareStatement(sql);
		    stmt.setString(1, aviao.getIdAviao());
		    stmt.setString(2, aviao.getModelo());
		    stmt.setString(3, aviao.getQtd_vagas());	   
		
		    stmt.executeUpdate();
		    System.out.println("Aviao incluido com sucesso!");
		
		}
		catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir aviao.");
		}
		finally{
			
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		}
		
		
		public List<Aviao> readAll(){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			String sql = " select idAviao, Qtd_Vagas from aviao";
			List<Aviao> avioes = new ArrayList<Aviao>();
		
			try{
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				
				while(rs.next()){
					
					Aviao aviao = new Aviao();
					aviao.setIdAviao(rs.getString("idAviao"));
					aviao.setQtd_vagas(rs.getString("Qtd_Vagas"));
					
					avioes.add(aviao);
				}
			}
			catch(SQLException e){
					
					System.out.println("Erro ao tentar ler aviao.");
				}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
				
			}
			
			return avioes;
		
		}
		
		public void delete(Aviao aviao){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			String sql = "delete from aviao where idAviao =?";
			
			try {
				stmt = con.prepareStatement(sql);
			    stmt.setString(1, aviao.getIdAviao());
			
			    stmt.executeUpdate();
			    System.out.println("Aviao excluido com sucesso!");
			
			}
			catch(SQLException e){
				
				e.printStackTrace();
				System.out.println("Erro ao tentar excluir aviao.");
			}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
			}
			
			}
		
		public void update(Aviao aviao){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			String sql = "update aviao set Qtd_Vagas =? where idAviao =?";
			
			try {
				stmt = con.prepareStatement(sql);
				
				stmt.setString(1, aviao.getQtd_vagas());
				stmt.setString(2, aviao.getIdAviao());
				
			    stmt.executeUpdate();
			    System.out.println("Aviao alterado com sucesso!");
			
			}
			catch(SQLException e){
				
				e.printStackTrace();
				System.out.println("Erro ao tentar alterar aviao.");
			}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
			}
			
			}
}
