package com.scemanticsquare.exce;

public class Excepption345 {
	public static void main(String[] args)
	{
		try
		{
		int a=20/0;
		System.out.println(a);
	    }
	    
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occurs");
		}
		catch(Exception e)
		{
		     System.out.println("task completed");
		}
		System.out.println("connection terminated");
	}
}