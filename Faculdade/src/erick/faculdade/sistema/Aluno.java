package erick.faculdade.sistema;

import java.util.ArrayList;
import java.util.Iterator;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String dataNasc;
	private int matricula;
	private ArrayList<Disciplina> disciplinas;
	
	
	public Aluno(String nome, String cpf, String dataNasc, int matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.matricula = matricula;		
		this.disciplinas = new ArrayList<>();
	}
	
	void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		System.out.println("Disciplina adicionada com sucesso");
	}
	
	void exibirDisciplinas() {
		System.out.println("Disciplinas que participa são: ");
		for(Disciplina disciplina : disciplinas) {
			System.out.println("- "+disciplina.getNome());
		}
	}
	
	
	
	void removerDisciplina(String nomeDisciplina) {
		Iterator<Disciplina> it = disciplinas.iterator();
		while(it.hasNext()) {
			Disciplina d = it.next();
			if(nomeDisciplina == d.getNome()) {
			it.remove();
			break;
			}
		}
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	

}
