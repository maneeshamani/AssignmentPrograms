package com.abc.java;

public class User {
	int id;
	String name;
	int salary;
	User(int Userid,String Username)
	{
	id=Userid;
	name=Username;
	}
	User(int Userid,String Username,int Usersalary)
	{
		this(Userid, Username);
		salary=Usersalary;
	}
	public static void main(String[] args)
	{
		User instructor=new User(1002,"Dheeru",30000);
		System.out.println("name:"+instructor.name);
		System.out.println("id:"+instructor.id);
		System.out.println("salary:"+instructor.salary);
	}
}