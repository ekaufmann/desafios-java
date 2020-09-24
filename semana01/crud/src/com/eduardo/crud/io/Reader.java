package com.eduardo.crud.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	private File filename;
	
	private String[] fileData;
	
	public Reader(File filename)
	{
		this.filename = filename;
	}
	
	private void readFile()
	{
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
			fileData = data.toString().split("\n");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public String[] getData()
	{
		if(fileData == null)
		{
			readFile();
		}
		return fileData;
	}
}
