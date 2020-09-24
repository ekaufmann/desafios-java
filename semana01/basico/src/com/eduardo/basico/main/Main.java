package com.eduardo.basico.main;

import com.eduardo.basico.singleton.Singleton;

public class Main {
	
	public static void main(String[] args)
	{
		Singleton singletonNumbers = Singleton.getInstance();
		
		System.out.println(singletonNumbers);
	}
}
