package com.section.abc.com;

	import java.util.Scanner;

	public class Farmer {
		float p;
		static float r;
		float t;
		float si;
		void input()
		{
		 try (Scanner scan = new Scanner(System.in)) {
			{
					System.out.println("enter the principle amount");
					p=scan.nextFloat();
					System.out.println("Enter the time in years");
					t=scan.nextFloat();
				r=2.0f;
			 }
		}
		}
		void compute()
		{
			si=(p*t*r)/100;
		}
		void display()
		{
			System.out.println(si);
		}
		public static void main(String[] args)
		{
			Farmer f1=new Farmer();
			Farmer f2=new Farmer();
			Farmer f3=new Farmer();
			f1.input();
			f2.input();
			f3.input();
			f1.compute();
			f2.compute();
			f3.compute();
			f1.display();
			f2.display();
			f3.display();
		}
	}