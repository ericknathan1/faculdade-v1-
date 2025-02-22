package erick.faculdade.sistema;
import java.util.ArrayList;
import java.util.Iterator;

public class Disciplina {
	
	private int codigo;
	private String nome;
	private int cargaHora;
	private ArrayList<Aluno> alunos;
	private Professor professor;
	private boolean temProfessor = false;
	
	
	public Disciplina(int codigo, String nome, int cargaHora) {
		this.codigo = codigo;
		this.nome = nome;
		this.cargaHora = cargaHora;
		this.alunos = new ArrayList<>();
	}
	
	
	void removeAluno(String nomeAluno) {
		Iterator<Aluno> it = alunos.iterator();
		while(it.hasNext()) {
			Aluno a = it.next();
			if(nomeAluno == a.getNome()) {
				it.remove();
				System.out.println("/nAluno removido com sucesso!");
				break;
			}
		}
	}
	
	void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		System.out.println("Aluno adicionado com sucesso");
	}
	
	void addProfessor(Professor professor) {
		if(temProfessor == true) {
			System.out.println("A disciplina atual já possui um professor!");
		}else {
			this.professor = professor;
			System.out.println("Professor adicionado com sucesso!");
		}
	}
	
	void exibirAlunos() {
		System.out.println("Os alunos desta disciplina são: ");
		for(Aluno aluno : alunos) {
			System.out.println("- "+aluno.getNome());
		}
	}
	
	void exibirProfessor() {
		System.out.println("O professor dessa disciplina é: "+this.professor.getNome());
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHora() {
		return cargaHora;
	}
	public void setCargaHora(int cargaHora) {
		this.cargaHora = cargaHora;
	}
	
	

}
