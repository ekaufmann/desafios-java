package com.eduardo.crud.controller;

import java.io.File;
import java.util.List;

import com.eduardo.crud.aluno.Aluno;

public class AlunoController {

	private List<Aluno> alunos;
	private static AlunoController alunoController;
	
	private AlunoController() {}
	
	public AlunoController getController()
	{
		if(alunoController == null)
		{
			alunoController = new AlunoController();
		}
		return alunoController;
	}
	
	public void create(int id, String name, String email)
	{
		
	}
	
	public void read(File filename)
	{
		
	}
	
	public void update()
	{
		
	}
	
	public void delete()
	{
		
	}
}
