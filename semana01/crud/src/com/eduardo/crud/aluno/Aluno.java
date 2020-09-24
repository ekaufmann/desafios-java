package com.eduardo.crud.aluno;

public class Aluno {
	
	private Integer id;
	private String name;
	private String email;
	
	public Aluno(Integer id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	public Integer getId() {
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEmail(String email)
	{
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
