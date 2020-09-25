package com.eduardo.crud.ui;

import java.io.File;
import java.util.Scanner;

import com.eduardo.crud.controller.AlunoController;
import com.eduardo.crud.util.UIUtil;

public class Console {
	
	private Scanner inputUser;
	private AlunoController alunoController;
	
	public Console() {
		inputUser = new Scanner(System.in);
		this.alunoController = AlunoController.getController(new File("alunos.txt"));
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
				case 1:	inputDataAluno(); break;
				case 2: showAlunos(); break;
				case 3: modifyAluno(); break;
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
		UIUtil.printLN("Digite a opção desejada: \n");
		UIUtil.printLN("1 - Criar novo aluno");
		UIUtil.printLN("2 - Mostrar alunos criados");
		UIUtil.printLN("3 - Alterar aluno já existente");
		UIUtil.printLN("4 - Deletar registro de aluno");
		UIUtil.printLN("5 - Mostrar menu de opções\n");
	}
	
	private void inputDataAluno()
	{
		UIUtil.printLN("Cadastro de novo aluno:");
		UIUtil.printLN("Informe a ID do aluno:");
		Integer id = Integer.parseInt(inputUser.next());
		inputUser.nextLine();
		UIUtil.printLN("Informe o nome do aluno:");
		String name = inputUser.nextLine().strip();
		UIUtil.printLN("Informe o e-mail do aluno:");
		String email = inputUser.nextLine().strip();
		
		alunoController.create(id, name, email);
	}
	
	private void showAlunos()
	{
		UIUtil.print(alunoController.read());
	}
	
	private void modifyAluno()
	{
		
	}
	
	private void deleteAluno()
	{
		UIUtil.printLN("teste delete");
	}
}
