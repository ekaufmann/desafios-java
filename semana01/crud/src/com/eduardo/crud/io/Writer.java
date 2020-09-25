package com.eduardo.crud.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
	
	private static void writeFile(File filename, String data)
	{
		try
		{
			PrintWriter printer = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
			printer.write(data);
			printer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void saveData(String data)
	{
		writeFile(FileValidator.getFile(), data);
	}
}
