package com.semanticsquare.concurrency;

public class RaceConditionDemo {
	public static void main(String[] args)
	{
		BankAccount task=new BankAccount();
		task.setBalance(100);
		
		Thread john=new Thread(task);
		Thread anitha=new Thread(task);
		john.setName("John");
        anitha.setName("Anitha");
        john.start();
        anitha.start();
	}

}
class BankAccount implements Runnable
{
	private int balance;
	public void setBalance(int balance) {
	}
	{
		this.balance=balance;
	}
	public void run() {
		makeWithdrwal(75);
		if(balance<0) {
			System.out.println("amount withdrawn!!!");
		}
	}
	private void makeWithdrwal(int amount) {
		if(balance   >=amount)
		{
			System.out.println(Thread.currentThread().getName());
			balance -=amount;
			System.out.println(Thread.currentThread().getName());
		}
		else
		{
			System.out.println("soory,not enough balance for" + Thread.currentThread().getName());
		}
	}
}