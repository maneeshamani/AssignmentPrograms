package com.omni.semanticsquare.com;
class Plane
{
	void takeoff()
	{
		System.out.println("plane is taking off");
	}
	void fly()
	{
		System.out.println("plane is flying");
	}
	void land()
	{
		System.out.println("plane is landing");
	}
}
class Cargoplane extends Plane
{
	void takeoff()
	{
		System.out.println("Cargoplane is requires longer way to taking off");
	}
	void fly() 
	{
		System.out.println("Cargo0plane is flying at low height");
	}
}
class Passengerplane extends Plane
{
	void takeoff()
	{
		System.out.println("passenger plane requires shoreter runway to taking off");
	}
	void fly()
	{
		System.out.println("passenger plane flying at medium height");
	}
}
public class Inherit2 {
	public static void main(String[] args)
	{
		Cargoplane c=new Cargoplane();
		Passengerplane p=new Passengerplane();
		Plane ref;
		ref=c;
		ref.takeoff();
		ref.fly();
		ref=p;
		p.takeoff();
		p.fly();
	}
}
