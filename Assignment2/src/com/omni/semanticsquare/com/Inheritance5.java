package com.omni.semanticsquare.com;
class Worker
{
	void dust()
	{
		System.out.println("dusting");
	}
	void sweep()
	{
		System.out.println("sweeping");
	}
	void wash()
	{
		System.out.println("washing");
	}
}
class Supervisor
{
	Worker w=new Worker();
	void dust()
	{
		w.dust();
	 
	}
	void sweep()
	{
		w.sweep();
	}
	void wash()
	{
		w.wash();
	}
}
public class Inheritance5 {
	public static void main(String[] args)
	{
		Supervisor s=new Supervisor();
		s.dust();
		s.sweep();
		s.wash();
	}
}