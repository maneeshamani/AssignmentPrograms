package com.scemanticsquare.exce;

public class Exception2 {
	public static void main(String[] args)
	{
		try
		{
			int a=50/0;
		}
		catch(ArithmeticException e)
		{
			int b=40/0;
			System.out.println("rest of code");
		}
	}
}