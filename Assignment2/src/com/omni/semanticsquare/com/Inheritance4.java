package com.omni.semanticsquare.com;
class Animal123
{
	void eat()
	{
		System.out.println("animal123 is eating");
	}
	void sleep()
	{
		System.out.println("Animal123 is sleeping");
	}
}
class Tiger123 extends Animal123
{
	void eat()
	{
		System.out.println("tiger hunts and eat");
	}
}
class Demo1
{
	Animal123 disp()
	{
		System.out.println("Demo1");
		Animal123 a1=new Animal123();
		return a1;
	}
}
class Demo2 extends Demo1
{
	Animal123 disp()
	{
		System.out.println("Animal");
		Animal123 a1 = null;
		return a1;
	}
	Tiger t1=new Tiger();
	
}

public class Inheritance4 {
	public static void main(String[] args)
	{
		Demo2 d=new Demo2();
		Demo1 d1=new Demo1();
		d.disp();
		d1.disp();
	}
}
