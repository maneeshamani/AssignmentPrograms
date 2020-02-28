package com.scemanticsquare.exce;

public class Exception1 {
	private static final char[] data = null;

	public static void main(String[] args)
	{
	try
	{
		int data=100/0;
	}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");

}
}
