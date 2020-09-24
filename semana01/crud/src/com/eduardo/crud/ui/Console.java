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
		alunoController = alunoController.getController(new File("alunos.txt"));
	}
	
	public void render()
	{
		boolean loop = true;
		while(loop)
		{
			UIUtil.printLN("Digite a opção desejada: \n");
			UIUtil.printLN("1 - Criar novo aluno");
			UIUtil.printLN("2 - Mostrar alunos criados");
			UIUtil.printLN("3 - Alterar aluno já existente");
			UIUtil.printLN("4 - Deletar registro de aluno\n");
			
			Integer input = inputUser.nextInt();
			
			switch(input)
			{
				case 1:	alunoData(); break;
				case 2: showAlunos(); break;
				case 3: modifyAluno(); break;
				case 4: deleteAluno(); break;
				default: 
					inputUser.close();
					loop = false;
			}
		}
	}
	
	private void alunoData()
	{
		
	}
	
	private void showAlunos()
	{
		
	}
	
	private void modifyAluno()
	{
		
	}
	
	private void deleteAluno()
	{
		
	}
}
