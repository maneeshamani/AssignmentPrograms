package com.section.abc.com;
	import java.util.concurrent.locks.Lock;
	import java.util.concurrent.locks.ReentrantLock;
	public class ExplicitLock {

		public static void main(String[] args) {
			
			Lock lock = new ReentrantLock();
			
			lock.lock();
			
			
			try {
				
		   
				
				
				
			} 
			finally 
			{
				
				lock.unlock();
			}
		}
	}
