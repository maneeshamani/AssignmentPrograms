package com.section.abc.com;

public class Circle {
		
		int square(int n) {
			
			return n*n;
		}
		
		
	     Circle circle; 
	     double d = 3.14;
	       
	     
	     double area(int radius) {
	    	 
	    	 Circle c = new Circle();
	    	 int rsquare = c.square(radius);
	    	 return d*rsquare;
	    	 
	    	 
	     }
	     
	     
	     public static void main(String[] args) {
			
	    	 
	    	 Circle circle = new Circle();
	    	 double result = circle.area(5);
	         System.out.println(result);    
	          	 
	    	 
	    	 
		}
	     
	     
	     
	     
	     

	}

