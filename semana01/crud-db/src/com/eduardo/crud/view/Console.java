package com.eduardo.crud.view;

import java.util.Scanner;

import com.eduardo.crud.dao.AlunoDAO;
import static com.eduardo.crud.util.UIUtil.*;
import static com.eduardo.crud.util.Messages.*;

public class Console {
	
	private Scanner inputUser;
	private AlunoDAO alunoDAO;
	
	public Console() {
		inputUser = new Scanner(System.in);
		this.alunoDAO = new AlunoDAO();
	}
	
	public void render()
	{
		boolean loop = true;
		
		showOptions();
		
		while(loop)
		{
			Integer input = inputUser.nextInt();
			
			switch(input)
			{
				case 1:
				case 2: inputDataAluno(input); break;
				case 3: showAlunos(); break;
				case 4: deleteAluno(); break;
				case 5: showOptions(); break;
				default: 
					inputUser.close();
					alunoDAO.close();
					loop = false;
			}
		}
	}
	
	private void showOptions()
	{
		printLN("\nDigite a opção desejada: \n");
		printLN("1 - Criar novo aluno");
		printLN("2 - Alterar aluno já existente");
		printLN("3 - Mostrar alunos criados");
		printLN("4 - Deletar registro de aluno");
		printLN("5 - Mostrar menu de opções\n");
	}
	
	private void inputDataAluno(Integer input)
	{
		if(input == 1)
		{
			printLN("\nCadastro de novo aluno:\n");
		} 
		else
		{
			printLN("\nAlterar cadastro de aluno: (Preencher somente dados que forem alterados!!!)\n");
		}
		
		Integer id;
		String nome;
		String idadeInput;
		Integer idadeInt;
		
		try {
			printLN("Informe o nome do aluno:");
			inputUser.nextLine();
			nome = inputUser.nextLine();
			printLN("Informe a idade do aluno:");
			idadeInput = inputUser.next();
			idadeInt = Integer.parseInt(idadeInput);
			
			nome = nome.strip();
			if(input == 1)
			{
				printLN(alunoDAO.createAluno(nome, idadeInt));
			} 
			else
			{
				if(nome.equals(""))
				{
					nome = null;
				}
				if(idadeInput.equals(""))
				{
					idadeInt = null;
				}
				printLN("Informe a ID do aluno:");
				id = Integer.parseInt(inputUser.next());
				inputUser.nextLine();
				printLN(alunoDAO.updateAluno(id, nome, idadeInt));
			}
		} catch (NumberFormatException e) {
			printLN(INVALID_DATA);
		}
	}
	
	private void showAlunos()
	{
		printLine();
		printLN("Alunos cadastrados:\n");
		print(alunoDAO.showAlunos());
	}
	
	private void deleteAluno()
	{
		printLN("Informe a ID do aluno:");
		Integer id = Integer.parseInt(inputUser.next());
		inputUser.nextLine();
		printLN(alunoDao.delete(id));
	}
}
