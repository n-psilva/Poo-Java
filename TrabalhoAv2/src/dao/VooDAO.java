package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import jdbc.ConnectionFactory;
import model.Voo;


public class VooDAO {
	
	public void create(Voo voo)
	{

	Connection con = ConnectionFactory.getConnection();
	PreparedStatement stmt = null;
	
	String sql = "insert into voo(IdVoo, Data_Ini_Ag, Data_Fim_Ag, Hora_Ini_Ag, Hora_Fim_Ag) values ( ?,?,?,?,?)";
	
	try {
		stmt = con.prepareStatement(sql);
	    stmt.setString(1, voo.getIdVoo());
	    stmt.setString(2, voo.getData_Ini_Ag());
	    stmt.setString(3, voo.getData_Fim_Ag());
	    stmt.setString(4, voo.getHora_Ini_Ag());
	    stmt.setString(5, voo.getHora_Fim_Ag());
	
	    stmt.executeUpdate();
	    System.out.println("Voo incluido com sucesso!");
	
	}
	catch(SQLException e){
		
		e.printStackTrace();
		System.out.println("Erro ao tentar incluir voo.");
	}
	finally{
		
		ConnectionFactory.closeConnection(con, stmt);
	}
	
	}
	
	
	public void readAll(){
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select IdVoo, Data_Ini_Ag, Data_Fim_Ag, Hora_Ini_Ag, Hora_Fim_Ag from voo";

	
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				JOptionPane.showMessageDialog(null,"Codigo: "+rs.getString(1)+"\nData Partida: "+ rs.getString(2)+ "\nData Chegada: "+
						rs.getString(3) +"\nHora Partida: " + rs.getString(4) +"\nHora Chegada: " + rs.getString(5));
				
			}
		}
		catch(SQLException e){
				
				System.out.println("Erro ao tentar ler voo.");
			}
		finally{
			
			ConnectionFactory.closeConnection(con, stmt);
			
		}
		
	
	
	}
	
	
	public void delete(Voo voo){
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "delete from voo where IdVoo =?";
		
		try {
			stmt = con.prepareStatement(sql);
		    stmt.setString(1, voo.getIdVoo());
		
		    stmt.executeUpdate();
		    System.out.println("Voo excluido com sucesso!");
		
		}
		catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Erro ao tentar excluir voo.");
		}
		finally{
			
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		}
	
	public void update(Voo voo){
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "update voo set Data_Ini_Ag = ? where IdVoo = ? ";
		
		try {
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, voo.getData_Ini_Ag());
			stmt.setString(2, voo.getIdVoo());
			
			
		    stmt.executeUpdate();
		    System.out.println("Voo alterado com sucesso!");
		
		}
		catch(SQLException e){
			
			e.printStackTrace();
			System.out.println("Erro ao tentar alterar Voo.");
		}
		finally{
			
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		}
	
	
}
