package com.omni.semanticsquare.com;
class Animal
{
	void eat()
	{
		System.out.println("aniumal is eating");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
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

public class Inherit1 
{
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		Deer d=new Deer();
		t.eat();
		t.sleep();
		d.eat();
		d.sleep();
	}
}