package com.eduardo.crud.aluno;

public class Aluno {
	
	private int id;
	private String name;
	private String email;
	
	public Aluno(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	@Override
	public String toString() 
	{
		StringBuilder output = new StringBuilder();
		output.append("\nID - ");
		output.append(id);
		output.append("\nName - ");
		output.append(name);
		output.append("\nE-mail - ");
		output.append(email);
		
		return output.toString();
	}
}
