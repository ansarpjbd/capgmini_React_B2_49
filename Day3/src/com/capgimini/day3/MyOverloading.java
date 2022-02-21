package com.capgimini.day3;
//POlymorphism
//method overloading-method with same name with different parameters
//it can be done with single class
//earling binding --compiler know which method to call in advance 
//compile time binding--compiler know which method to call in advance 

class Person
{

	public void work(String parentwork)
	{
		System.out.println("it is parent work");
	}
	
	public void work(String freindwork,int task)
	{
		System.out.println("doing task for friends "+task);
	}
	public void work(String social,float money)
	{
	System.out.println("spend on social cause "+money);
	
	}	
}


public class MyOverloading {

		public static void main(String args[])
		{
			//task are defined 
			Person ansar=new Person();
			//ansar.work("parent 10 with 2");
			//ansar.work("firends work", 10);
			ansar.work("heliping study student", 5000);
		}
}
