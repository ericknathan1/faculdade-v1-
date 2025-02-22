package erick.faculdade.sistema;
import java.util.ArrayList;

public class Professor {

	private String nome;
	private String cpf;
	private String dataNasc;
	private int matricula;
	private Disciplina disciplina;
	
	public Professor(String nome, String cpf, String dataNasc, int matricula) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.matricula = matricula;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
	
	
}
