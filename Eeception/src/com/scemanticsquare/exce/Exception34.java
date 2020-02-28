package com.scemanticsquare.exce;

public class Exception34 {
	public static void main(String[] args)
	{
		try
		{
		int a=30/0;
		System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index out of bound exception occurs");
		}
		catch(Exception e)
		{
			System.out.println("Exception occurs");
		}
		System.out.println("connection terminated");
	}
}
