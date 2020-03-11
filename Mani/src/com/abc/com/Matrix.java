package com.abc.com;

import java.util.Scanner;

public class Matrix {

	public static int[][] matrix(int rows, int cols) {
		int[][] matrix = new int[rows][cols];
		for (int i = 0, val = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = ++val;
			}
		}
		return matrix;
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			}
		}
	
	
	
	public static boolean searchCrudeApproach(int[][] matrix, int number) {
		return true;
	}
	
	public static boolean searchEfficient(int[][] matrix, int number) {
		return false;
	}

	public static void main(String[] args) {
		System.out.println("enter the no.of rows in the matrix");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("enter the no.of columns in the matrix");
		int j = sc.nextInt();
		int[][] matrix = matrix(i, j);
		print(matrix);
	}
}
