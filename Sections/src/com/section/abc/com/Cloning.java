package com.section.abc.com;

public class Cloning implements Cloneable{
			
		int i;
		int j;
		
		@Override
		public String toString() {
			return "Abc [i=" + i + ", j=" + j + "]";
		}


		@Override
		protected Object clone() throws CloneNotSupportedException {
			
			return super.clone();
		}


		public static void main(String[] args) throws CloneNotSupportedException {
			

			 Cloning obj = new Cloning();
			 obj.i = 5;
			 obj.j = 6;
			 
			 Cloning obj1 = (Cloning)obj.clone();
			 
			 obj1.j = 8;
			
			 
			 System.out.println(obj1);  // 5 8
			 System.out.println(obj); // 5 6		
		}
}