package practice.java.prgm;
class Bottle
{
	String colour;
	int cost;
	int height;
	Bottle(String x,int y,int z)
	{
		x=colour;
		y=cost;
		z=height;
	}
	public String getcolour() {
		return colour;
	}
	public int getheight() {
		return height;
	}
	public int getcost() {
		return cost;
	}
}
public class Constructor {
	public static void main(String[] args)
	{
		Bottle b=new Bottle("blue",70,20);
		b.getcol
		System.out.println(b);
	}
}