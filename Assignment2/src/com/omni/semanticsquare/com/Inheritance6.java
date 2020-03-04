package com.omni.semanticsquare.com;
class OS
{
	String name;
	OS(String name)
	{
	    this.name=name;	
	}
	  String Name()
	{
		return name;
	}
	  
}
class Charger
{
	String brand;
	Charger(String brand)
	{
		this.brand=brand;
	}
	 String brand()
	{
		return brand;
	}
}
class Mobile
{
	OS os=new OS("Android");
	void hasA(Charger c)
	{
		System.out.println(c.brand());
	}
}
public class Inheritance6 {
	public static void main(String[] args)
	{
		Mobile m=new Mobile();
		Charger c=new Charger("nokia");
		System.out.println(m.os.Name());
		System.out.println(c.brand());
		m.hasA(c);
	}
}
