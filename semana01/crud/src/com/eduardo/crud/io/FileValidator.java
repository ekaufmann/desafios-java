package com.eduardo.crud.io;

import java.io.File;
import java.io.IOException;

public class FileValidator {

	private static File filename = new File("alunos.txt");
	
	private static void validateFile()
	{
		if(!filename.exists())
		{
			try {
				filename.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static File getFile()
	{
		validateFile();
		return filename;
	}
}
