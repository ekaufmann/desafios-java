package com.eduardo.crud.aluno;

public class Aluno {
	
	private Integer id;
	private String name;
	private Integer idade;
	
	public Aluno(Integer id, String name, Integer idade)
	{
		this.id = id;
		this.name = name;
		this.idade = idade;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setIdade(Integer idade)
	{
		this.idade = idade;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder output = new StringBuilder();
		output.append(id);
		output.append("\n");
		output.append(name);
		output.append("\n");
		output.append(idade);
		output.append("\n");
		
		return output.toString();
	}
}
