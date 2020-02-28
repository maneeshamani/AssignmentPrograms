package com.scemanticsquare.exce;

public class NestedExceptions {
	public static void main(String[] args)
	{
			try
			{
				int a=20/0;
				System.out.println("a");
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmeticexception occurs");
			}
			try
			{
				int a[]=new int[5];
				System.out.println(a[8]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of bound exception is occurs");
			}
				catch(Exception e)
				{
					System.out.println("exception occurs");
				}
			System.out.println("connection terminated");
		}
	}	