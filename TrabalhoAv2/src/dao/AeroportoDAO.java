package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Aeroporto;


public class AeroportoDAO {
		
		public void create(Aeroporto aeroporto)
		{

		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aeroporto(idAeroporto, cidade, nome_Aero, situacao) values( ?, ?, ?, ?)";
		
		try {
			stmt = con.prepareStatement(sql);
		    stmt.setString(1, aeroporto.getIdAeroporto());
		    stmt.setString(2, aeroporto.getCidade());
		    stmt.setString(3, aeroporto.getNome());
		    stmt.setString(4, aeroporto.getSituacao());
		
		    stmt.executeUpdate();
		    System.out.println("Aeroporto incluido com sucesso!");
		
		}
		catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir aeroporto.");
		}
		finally{
			
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		}
		
		
		public void readAll(){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			String sql = " select idAeroporto, situacao from aeroporto";
		
			try{
				stmt = con.prepareStatement(sql);
				rs = stmt.executeQuery();
				
				while(rs.next()){
					JOptionPane.showMessageDialog(null,"Codigo: "+rs.getString(1)+"\nSituação: "+ rs.getString(2)+ "\n" );
	
				}
			}
			catch(SQLException e){
					
					System.out.println("Erro ao tentar ler aeroporto.");
				}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
				
			}
			
			
		
		}
		
		public void delete(Aeroporto aeroporto){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			String sql = "delete from aeroporto where idAeroporto =?";
			
			try {
				stmt = con.prepareStatement(sql);
			    stmt.setString(1, aeroporto.getIdAeroporto());
			
			    stmt.executeUpdate();
			    System.out.println("Aeroporto excluido com sucesso!");
			
			}
			catch(SQLException e){
				
				e.printStackTrace();
				System.out.println("Erro ao tentar excluir aeroporto.");
			}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
			}
			
			}
		
		public void update(Aeroporto aeroporto){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			String sql = "update aeroporto set situacao = ? where idAeroporto = ? ";
			
			try {
				stmt = con.prepareStatement(sql);
				
				stmt.setString(1, aeroporto.getSituacao());
				stmt.setString(2, aeroporto.getIdAeroporto());
				
			    stmt.executeUpdate();
			    System.out.println("Aeroporto alterado com sucesso!");
			
			}
			catch(SQLException e){
				
				e.printStackTrace();
				System.out.println("Erro ao tentar alterar aeroporto.");
			}
			finally{
				
				ConnectionFactory.closeConnection(con, stmt);
			}
			
			}
}
