package com.abc.java;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args)
	{
		int a[]=new int[5];
		try (Scanner scan = new Scanner(System.in)) {
			for(int i=0;i<=a.length-1;i++)
			{
				System.out.println("Enter the marks");
				a[i]=scan.nextInt();
				System.out.println("marks of the students are:");
				for(int i1=0;i1<a.length-1;i1++)
				{
					System.out.println(a[i1]);
			}
		}
		}
		
	}

}
