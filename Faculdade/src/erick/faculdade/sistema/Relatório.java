package erick.faculdade.sistema;

public class Relatório {
	
	static void gerarRelatorio(Disciplina disciplina) {
		System.out.println("\nRELATÓRIO:");
		disciplina.exibirAlunos();
		disciplina.exibirProfessor();
	}
	
	public static void main(String[] args) {
		
		//Criando os objetos para testagem
		
		Disciplina disciplina1 = new Disciplina(12, "ADS", 40);
		Professor professor1 = new Professor("Roberto", "1", "14-02-1969", 134);
		Aluno aluno1 = new Aluno("Gabriel", "1", "15-01-2004", 777);
		Aluno aluno2 = new Aluno("Allan", "1", "15-01-2004", 777);
		Aluno aluno3 = new Aluno("Gustavo", "1", "15-01-2004", 777);
		
		//adicionando os alunos e o professor na disciplina criada.
		disciplina1.addAluno(aluno1);
		disciplina1.addAluno(aluno2);
		disciplina1.addAluno(aluno3);
		disciplina1.addProfessor(professor1);
		
		//exibindo o relatorio da disciplina.
		gerarRelatorio(disciplina1);
		
		//testando remoção de alunos
		/*
		disciplina1.removeAluno("Gabriel");
		gerarRelatorio(disciplina1);
		*/
	}

}
