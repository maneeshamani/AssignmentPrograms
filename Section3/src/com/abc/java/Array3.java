package com.abc.java;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		{
			int[][][][] a=new int[2][][][];
			a[0]=new int[3][][];
			a[1]=new int[2][][];
			a[0][0]=new int[2][];
			a[0][1]=new int[1][];
			a[0][2]=new int[2][];
			a[1][0]=new int[2][];
			a[1][1]=new int[1][];
			a[0][0][0]=new int[3];
			a[0][0][1]=new int[2];
			a[0][1][0]=new int[4];
			a[0][2][0]=new int[1];
			a[0][2][1]=new int[2];
			a[1][0][0]=new int[3];
			a[1][0][1]=new int[4];
			a[1][1][0]=new int[2];
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					for(int k=0;k<=a[i][j].length-1;k++)
					{
						for(int l=0;l<=a[i][j][k].length-1;l++)
						{
							System.out.println("enter the marks of city"+i+"school"+j+"class"+k+"students"+l);
							a[i][j][k][l]=scan.nextInt();
						}
					}
				}
			}
			System.out.println("enter the marks of students are:");
			for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					for(int k=0;k<=a[i][j].length-1;k++)
					{
						for(int l=0;l<=a[i][j][k].length-1;l++)
						{
							System.out.println(a[i][j][k][l]);
						}
					}
				}
			}
		}
	}
}
