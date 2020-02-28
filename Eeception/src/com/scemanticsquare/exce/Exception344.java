package com.scemanticsquare.exce;

public class Exception344 {
	public static void main(String[] args)
	{
		try {
		int a[]=new int[5];
		System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithemtic Exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs");
		}
		System.out.println("connection terminated");
	}
}