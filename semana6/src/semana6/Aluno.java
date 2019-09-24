package semana6;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	
	
	
	public void pagarMensalidade(float valor){
		
		System.out.println("Obrigado o valor recebido = " + valor);
		System.out.println("Valor da mensalidade = " + valor);
	}
	
	public void cancelarMatricula(){
		
		System.out.println("Matricula cancelada com sucesso!");
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
