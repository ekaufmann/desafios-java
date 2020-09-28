package com.eduardo.crud.model;

public class Aluno {

	private int id;
	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}

	public Aluno(int id, String nome, int idade) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString()
	{
		StringBuilder output = new StringBuilder();
		output.append(id);
		output.append(" - ");
		output.append(nome);
		output.append(" - ");
		output.append(idade);
		
		return output.toString();
	}
}
