package com.eduardo.crud.util;

import java.util.ArrayList;
import java.util.List;

import com.eduardo.crud.aluno.Aluno;

public class AlunoObjectsCreator {

	public static List<Aluno> createList(String[] data)
	{
		List<Aluno> list = new ArrayList<>();
		
		for(int i = 0; i < data.length - 1; i++)
		{
			if(NumberUtil.isNumeric(data[i]) && !data[i+1].equals(""))
			{
				Aluno aluno = new Aluno(Integer.parseInt(data[i]), data[i + 1], Integer.parseInt(data[i + 2]));
				list.add(aluno);
			}
		
		}
		return list;
	}
}
