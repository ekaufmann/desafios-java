package com.eduardo.crud.util;

public class NumberUtil {

	public static boolean isNumeric(String number)
	{
		try
		{
			Integer.parseInt(number);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}
}
