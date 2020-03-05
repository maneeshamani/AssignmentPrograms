package com.abc.java;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args)
	{
		int a[][]=new int[3][4];
		try (Scanner scan = new Scanner(System.in)) {
			for(int i=0;i<a.length-1;i++)
			{
				for(int j = 0;j<a[i].length-1;j++)
				{
					System.out.println("enter the marks of class"+i+"Students"+j);
					a[i][j]=scan.nextInt();
				}
			}
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					System.out.println(a[i][j]);
				}
			}
		}
	}
}