package com.section.abc.com;

public class Name {
		final int x;

		public Name(int x) {
			super();
			this.x = x;
		}
		
		
		public int getX() {
			
			return x;
		}
		
		public static void main(String[] args) {
			
			
	         Name n= new Name(10);
			
			System.out.println(n.getX());
		}
}