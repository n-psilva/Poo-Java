package semana3.poo.exe2;

public class Aluno {
	
	private String matricula;
	private String nome;
	private String curso;
	private String faculdade;
	
	// construtor com parametro
	public Aluno(String fac){
		this.faculdade = fac;
		
	}
	
	// construtor sem parametro
	
	public Aluno(){
		this.faculdade ="Unilasalle RJ";
		
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		
		if(curso.equalsIgnoreCase("si")){
			
			curso = "Sistema de Informação";
		}
		else{
			this.curso = curso;
		}
		
		
	}
	
	public void listar(){
		
		System.out.println("Matricula = " + this.matricula);
		System.out.println("Nome = " + this.nome);
		System.out.println("Curso = " + this.curso);
		System.out.println("Faculdade = " + this.faculdade);
	}

}
