package semana6;

public class PessoaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Pessoa p1 = new Pessoa();
		
		p1.setNome("natan");
		p1.setIdade(29);*/
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Jonatan");
		a1.setIdade(20);
		a1.setMatricula(005001000);
		a1.setCurso("SI");
		
		Professor prof = new Professor();
		
		prof.setNome("João");
		prof.setIdade(40);
		prof.setSexo("M");
		prof.setSalario(2000);
		prof.setEspecialidade("Mestre");
		prof.receberAumento(500);
		
		Funcionario func = new Funcionario ();
		
		func.setNome("Carlos");
		func.setIdade(35);
		func.setSexo("M");
		func.setSetor("TI");
		func.setTrabalhando(true);
		func.mudouTrabalho();
		
		
		//visitante
		
		
		
		Bolsista bolsista = new Bolsista();
		bolsista.setBolsa(100);
		bolsista.setNome("Diego");
		bolsista.setIdade(15);
		
		
		
		//System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(prof.toString());
		System.out.println(func.toString());
		//System.out.println(visit.toString());
		System.out.println(bolsista.toString());
		
		a1.pagarMensalidade(1000);
		bolsista.pagarMensalidade(900);

	}

}
