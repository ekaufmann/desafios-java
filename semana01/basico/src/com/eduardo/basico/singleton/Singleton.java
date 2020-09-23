package com.eduardo.basico.singleton;

public class Singleton {
	
	private static Singleton instance = null;
	
	private int[] numbers;
	
	private Singleton()
	{
		this.numbers = new int[10];
	}
	
	private void populateNumbers()
	{
		for(int i = 0; i < this.numbers.length; i++)
		{
			this.numbers[i] = i + 1;
		}
	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
	
	@Override
	public String toString()
	{
		StringBuilder output = new StringBuilder();
		this.populateNumbers();
		
		for(int i = 0; i < this.numbers.length - 1; i++)
		{
			if(this.numbers[i] < 9)
			{
				output.append(this.numbers[i]);
				output.append(", ");
				continue;
			}
			output.append(this.numbers[i]);
		}
		output.append(" ou ");
		output.append(this.numbers[this.numbers.length - 1]);
		
		return output.toString();
	}
}
