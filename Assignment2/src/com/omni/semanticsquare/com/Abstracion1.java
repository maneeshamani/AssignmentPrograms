package com.omni.semanticsquare.com;
abstract class AeroPlane
{
	abstract void takeoff();
	abstract void fly();
	abstract void land();
}
class AirBus extends AeroPlane
{
	void takeoff()
	{
		System.out.println("cargoplane requires longerrunway takeoff");
	}
	void fly()
	{
		System.out.println("cargoplane is flying at medium height");
	}
	void land()
	{
		System.out.println("cargoplane is landing");
	}
}
public class Abstracion1 {
	public static void main(String[] args)
	{
		AeroPlane cp=new AirBus();
		cp.fly();
		cp.takeoff();
		cp.land();
	}
}