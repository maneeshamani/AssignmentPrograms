package com.section.abc.com;
interface Interf
{
	   void call();
}

	class SamSung implements Interf{
		public void call()
		{
				System.out.println("Samsung Mobile");	
		}
		public void apps() 
		{
			System.out.println("Play store");
		}
		public static void main(String[] args) {
			SamSung samSung = new SamSung();
			samSung.call();
			samSung.apps();
			Interf tablet = new SamSung();
			tablet.call();
		}		
}

