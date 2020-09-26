package com.eduardo.crud.ui;

import java.util.Scanner;

import com.eduardo.crud.controller.AlunoController;
import com.eduardo.crud.util.Messages;
import com.eduardo.crud.util.UIUtil;

public class Console {
	
	private Scanner inputUser;
	private AlunoController alunoController;
	
	public Console() {
		inputUser = new Scanner(System.in);
		this.alunoController = AlunoController.getController();
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
					loop = false;
			}
		}
	}
	
	private void showOptions()
	{
		UIUtil.printLN("\nDigite a opção desejada: \n");
		UIUtil.printLN("1 - Criar novo aluno");
		UIUtil.printLN("2 - Alterar aluno já existente");
		UIUtil.printLN("3 - Mostrar alunos criados");
		UIUtil.printLN("4 - Deletar registro de aluno");
		UIUtil.printLN("5 - Mostrar menu de opções\n");
	}
	
	private void inputDataAluno(Integer input)
	{
		if(input == 1)
		{
			UIUtil.printLN("\nCadastro de novo aluno:\n");
		} 
		else
		{
			UIUtil.printLN("\nAlterar cadastro de aluno:\n");
		}
		
		Integer id;
		String name;
		String idade;
		
		try {
			UIUtil.printLN("Informe a ID do aluno:");
			id = Integer.parseInt(inputUser.next());
			inputUser.nextLine();
			UIUtil.printLN("Informe o nome do aluno:");
			name = inputUser.nextLine().strip();
			UIUtil.printLN("Informe a idade do aluno:");
			idade = inputUser.nextLine();
			
			if(input == 1)
			{
				UIUtil.printLN(alunoController.create(id, name, Integer.parseInt(idade)));
			} 
			else
			{
				if(idade.equals(""))
				{
					idade = null;
				}
				UIUtil.printLN(alunoController.update(id, name, Integer.parseInt(idade)));
			}
		} catch (NumberFormatException e) {
			UIUtil.printLN(Messages.INVALID_DATA);
		}
	}
	
	private void showAlunos()
	{
		UIUtil.printLine();
		UIUtil.printLN("Alunos cadastrados:\n");
		UIUtil.print(alunoController.read());
	}
	
	private void deleteAluno()
	{
		UIUtil.printLN("Informe a ID do aluno:");
		Integer id = Integer.parseInt(inputUser.next());
		inputUser.nextLine();
		UIUtil.printLN(alunoController.delete(id));
	}
}
