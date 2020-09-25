package com.eduardo.crud.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.eduardo.crud.aluno.Aluno;
import com.eduardo.crud.io.Reader;
import com.eduardo.crud.io.Writer;
import com.eduardo.crud.util.AlunoObjectsCreator;

public class AlunoController {

	private List<Aluno> alunos;
	private static AlunoController alunoController;
	private File filename;
	
	private AlunoController(File filename, List<Aluno> alunos)
	{
		this.alunos = alunos;
		this.filename = filename;
	}
	
	public static AlunoController getController(File filename)
	{		
		if(!filename.exists())
		{
			try {
				filename.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@SuppressWarnings("unchecked")
		List<Aluno> data = (ArrayList<Aluno>) AlunoObjectsCreator.createList(Reader.getData(filename));
		
		if(alunoController == null)
		{
			alunoController = new AlunoController(filename, data);
		}
		return alunoController;
	}
	
	public void create(Integer id, String name, String email)
	{
		Aluno aluno = new Aluno(id, name, email);
		alunos.add(aluno);
		saveData();
	}
	
	public String read()
	{
		if(alunos.size() == 0)
		{
			return "Não há alunos cadastrados!";
		}
		
		StringBuilder output = new StringBuilder();
		for(Aluno aluno : alunos)
		{
			output.append(aluno.toString());
			output.append("\n");
		}
		return output.toString();
	}
	
	public void update(Integer id, String name, String email)
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
			create(id, name, email);
		}
		else
		{
			if(name.equals(""))
			{
				alunoFound.setEmail(email);
			}
			if(email.equals(""))
			{
				alunoFound.setName(name);
			}
		}
		saveData();
	}
	
	public void delete(Integer id)
	{
		for(Aluno aluno : alunos)
		{
			if(aluno.getId() == id)
			{
				alunos.remove(aluno);
			}
		}
		saveData();
	}
	
	private void saveData()
	{
		Writer.saveData(filename, read());
	}
}
