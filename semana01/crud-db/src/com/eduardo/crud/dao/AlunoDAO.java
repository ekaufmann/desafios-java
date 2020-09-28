package com.eduardo.crud.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eduardo.crud.datasource.DataSource;
import com.eduardo.crud.model.Aluno;

import static com.eduardo.crud.util.Messages.*;

public class AlunoDAO {
	
	private List<Aluno> alunos;
	private DataSource ds;
	private Connection connection;
	private static final String TABELA = "aluno";
	
	public AlunoDAO()
	{
		this.alunos = new ArrayList<>();
		this.ds = new DataSource();
		this.connection = ds.getConnection();
	}
	
	public String createAluno(String nome, int idade)
	{
		String query = "INSERT INTO " + TABELA + " (nome, idade) VALUES ( '" + nome + "', " + idade + " );";
		
		try 
		{
			Statement statement = connection.createStatement();
			statement.execute(query);
			
			return SAVED;
		}
		catch (SQLException e) 
		{
			System.err.println(ERROR_SAVE + e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println(ERROR + e.getMessage());
		}
		return "";
	}
	
	public String updateAluno(int id, String nome, Integer idade)
	{
		String search = "SELECT * FROM aluno WHERE aluno.id = " + id + ";";
		String update = "UPDATE aluno SET ";
		
		if(nome == null)
		{
			update += "idade = " + idade + " WHERE id = " + id + ";";
		} 
		else if(idade == null)
		{
			update += "nome = '" + nome + "' WHERE id = " + id + ";";
		} 
		else 
		{
			update += "nome = '" + nome + "', idade = " + idade + " WHERE id = " + id + ";";
		}
		
		try 
		{
			PreparedStatement ps = connection.prepareStatement(search);
			ResultSet result = ps.executeQuery();
			
			if(!result.next())
			{
				createAluno(nome, idade);
			}
			else
			{
				ps = connection.prepareStatement(update);
				ps.execute(update);
				return SAVED;
			}
		} 
		catch (SQLException e) 
		{
			System.err.println(ERROR_SAVE + e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println(ERROR + e.getMessage());
		}
		return "";
	}
	
	private void readAlunos()
	{
		alunos.clear();
		String query = "SELECT * FROM " + TABELA;
		Aluno aluno;
		try 
		{
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet resultado = ps.executeQuery();
			int id;
			String nome;
			int idade;			
			
			while(resultado.next())
			{
				id = resultado.getInt("id");
				nome = resultado.getString("nome");
				idade = resultado.getInt("idade");
				aluno = new Aluno(id, nome, idade);
				
				alunos.add(aluno);
			}
		} 
		catch (SQLException e) 
		{
			System.err.println(ERROR_READ + e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println(ERROR + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public String showAlunos()
	{
		readAlunos();
		StringBuilder output = new StringBuilder();
		for(Aluno aluno : alunos)
		{
			output.append(aluno.toString());
			output.append("\n");
		}
		return output.toString();
	}
	
	public void close()
	{
		ds.closeDataSource();
	}
	
	public String delete(int id)
	{
		
	}
}
