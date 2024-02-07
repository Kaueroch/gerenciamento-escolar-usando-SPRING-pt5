package com.gerenciamento.escolar;

import java.util.ArrayList;

public class Escola{
	private ArrayList<String> Alunos = new ArrayList<String>();
	private ArrayList<String> Professores= new ArrayList<String>();
	private ArrayList<String> Disciplina= new ArrayList<String>();
	
	
	public ArrayList<String> getAlunos() {
		return Alunos;
	}
	public void setAlunos(ArrayList<String> alunos) {
		Alunos = alunos;
	}
	public ArrayList<String> getProfessores() {
		return Professores;
	}
	public void setProfessores(ArrayList<String> professores) {
		Professores = professores;
	}
	public ArrayList<String> getDisciplina() {
		return Disciplina;
	}
	public void setDisciplina(ArrayList<String> disciplina) {
		Disciplina = disciplina;
	}
	public void Adicionaraluno(String nomes) {
		if(nomes == null || nomes.isEmpty()) {
		    System.out.println("ERRO!!Por favor, cadastre novamente! ");
		}
		else {
			Alunos.add(nomes);
		}
	}
}
