package com.eduardo.basico.main;

import com.eduardo.basico.singleton.Singleton;

public class Main {
	
	public static void main(String[] args)
	{
		Singleton singletonNumeros = Singleton.getInstance();
		
		System.out.println(singletonNumeros);
	}
}
