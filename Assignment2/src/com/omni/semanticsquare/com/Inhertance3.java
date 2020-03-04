package com.omni.semanticsquare.com;
class Animal
{
	void eat()
	{
		System.out.println("animal is eating");
	}
	void sleep()
	{
		System.out.println("animal is sleeping");
	}
}
class Tiger extends Animal
{
	void eat()
	{
		System.out.println("tiger hunts and eat");
	}
}
class Deer extends Animal
{
	void eat() 
	{
		System.out.println("Deer grase and eats");
	}
}

class Forest
{
	void permitt(Animal ref)
	{
		ref.eat();
		ref.sleep();
	}
}

public class Inhertance3 {
	public static void main(String args[])
	{
		Tiger t=new Tiger();
		Deer d=new Deer();
		Forest f=new Forest();
		f.permitt(t);
		f.permitt(d);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	