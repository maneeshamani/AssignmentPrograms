package com.semanticsquare.concurrency;

public class MyThread {
	static void m1()
	{
		System.out.println("m1");
	}
	static void m2()
	{
		System.out.println("m1");
	}
	static void m3()
	{
		System.out.println("m1");
	}
	public static void main(String[] args)
	{
		m1();
		m2();
	}
}
