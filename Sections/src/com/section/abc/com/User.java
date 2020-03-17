package com.section.abc.com;

public class User {
		
		public void printUser(User user) {
			user.printUser(user);
		}
		public static void main(String[] args) {
	    User staff = new User();
	    staff.staticMethod();
	    (staff).staticMethod();
		}
		private void staticMethod() {
			
		}
}