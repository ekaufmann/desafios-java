package com.eduardo.crud.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	private static String[] readFile(File filename)
	{
		String[] fileData = null;
		try
		{
			BufferedReader buffer = new BufferedReader(new FileReader(filename));
			String linha = null;
			StringBuilder data = new StringBuilder();
			
			while((linha = buffer.readLine()) != null)
			{
				data.append(linha);
			}
			buffer.close();
			fileData = data.toString().strip().split("\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return fileData;
	}
	
	public static String[] getData(File filename)
	{
		return readFile(filename);
	}
}
