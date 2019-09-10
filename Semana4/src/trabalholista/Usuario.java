package trabalholista;

import java.util.ArrayList;

public class Usuario {

	private String login;
	private String senha;
	private ArrayList<Tweet> tweets;
	
	// metodo construtor
	public Usuario(){
		setSenha("OOP");
		this.tweets = new ArrayList<Tweet>();
	}
	
	
	//metodo get e set
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
     public void addTweet(Tweet novotw){
		
		this.tweets.add(novotw);
		System.out.println("Tweet inserido!");
	}
	
	// listar os tweets 
	public void ListarTweet(){
		
		for(Tweet tw:tweets){
			
			System.out.println("Tweet: " + tw.getDescricao());
		}
	}
	
	
}
