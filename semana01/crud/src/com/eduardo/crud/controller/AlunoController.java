package com.eduardo.crud.controller;

import java.util.List;

import com.eduardo.crud.aluno.Aluno;
import com.eduardo.crud.io.Reader;
import com.eduardo.crud.io.Writer;
import com.eduardo.crud.util.AlunoObjectsCreator;

import static com.eduardo.crud.util.Messages.*;

public class AlunoController {

	private List<Aluno> alunos;
	private static AlunoController alunoController;
	
	private AlunoController(List<Aluno> alunos)
	{
		this.alunos = alunos;
	}
	
	public static AlunoController getController()
	{
		List<Aluno> data = AlunoObjectsCreator.createList(Reader.getData());
		
		if(alunoController == null)
		{
			alunoController = new AlunoController(data);
		}
		return alunoController;
	}
	
	public String create(Integer id, String name, Integer idade)
	{
		if(name.equals("") || id == null || idade == null)
		{
			return INVALID_DATA;
		}
		Aluno aluno = new Aluno(id, name, idade);
		alunos.add(aluno);
		saveData();
		return REGISTERED;
	}
	
	public String read()
	{
		if(alunos.size() == 0)
		{
			return EMPTY_FILE;
		}
		
		StringBuilder output = new StringBuilder();
		for(Aluno aluno : alunos)
		{
			output.append(aluno.toString());
			output.append("\n");
		}
		return output.toString();
	}
	
	public String update(Integer id, String name, Integer idade)
	{
		Aluno alunoFound = null;
		for(Aluno aluno : alunos)
		{
			if(aluno.getId() == id)
			{
				alunoFound = aluno;
			}
		}
		
		if(alunoFound == null)
		{
			create(id, name, idade);
			return REGISTERED;
		}
		else
		{
			if(name.equals(""))
			{
				alunoFound.setIdade(idade);
			}
			if(idade == null)
			{
				alunoFound.setName(name);
			}
		}
		saveData();
		return MODIFIED;
	}
	
	public String delete(Integer id)
	{
		for(Aluno aluno : alunos)
		{
			if(aluno.getId() == id)
			{
				alunos.remove(aluno);
				saveData();
				return DELETED;
			}
		}
		return INVALID_DATA;
	}
	
	private void saveData()
	{
		Writer.saveData(read().strip());
	}
}
