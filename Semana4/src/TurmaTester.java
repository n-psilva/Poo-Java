
public class TurmaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aluno a1 = new Aluno();
		a1.setMatricula("001");
		a1.setNome("Jonatan");
		
		Turma poo = new Turma();
		poo.addAluno(a1);
		
		a1 = new Aluno();
		a1.setMatricula("002");
		a1.setNome("Alex");
		
		poo.addAluno(a1);
		
		poo.imprimirAluno();
		
		
		
	}

}
