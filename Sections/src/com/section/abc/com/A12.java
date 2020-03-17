package com.section.abc.com;

interface A12 {
		public void getInfo();
		
	}


	class DemoImpClass implements A12{
		
		
		public  void getInfo() {
			
			System.out.println("I'm in implementation class");
			
		}

		public static void main(String[] args) {
			
			
		DemoImpClass A12 = new DemoImpClass();
		System.out.println(Thread.currentThread().getThreadGroup().getName());
			
		ThreadGroup group = new ThreadGroup("FirstGroup");
		System.out.println(group.getName());
		
		Thread t1 = new Thread(group,"First");

		System.out.println("First thread parent: "+group.getParent().getName());
		
		Thread t2 = new Thread(group,"Second");
		System.out.println("Second thread parent: "+ Thread.currentThread());

		group.setMaxPriority(3);
		
		Thread t3 = new Thread(group,"Third");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		}
	}