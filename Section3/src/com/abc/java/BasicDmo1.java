package com.abc.java;

public class BasicDmo1 {
	static void print()
	{
		System.out.println("Hello world");
		System.out.println("hello");
		System.out.println("world");
		System.out.println("");
	}
	@SuppressWarnings("unused")
	static void primitives()
	{
		System.out.println("print primitive values");
		int intHexa=0X0041;
				System.out.println("Hexa"+intHexa);
		int intBinary=010101;
				System.out.println("Binary"+intBinary);
		int intUnderscore=12_32_1;
				System.out.println("Underscore"+intUnderscore);
				char charA='A';
				System.out.println("print character");
				char charInt=65;
				System.out.println("print int value");
				char charUnicode1=0043;
				System.out.println("unicode value printed");
				char charUnicode2=63;
				System.out.println("unicode 2 value printed");
				}
	public static void main(String[] args)
	{
		primitives();
	}
}


