package com.capgimini.day3;

//late binding
//run time polymorphism
//Overriding
//Rule--it will be done with child and base class only
//
class Employee extends Person
{
	public void work(String officeWork)
	{
		System.out.println("i am doing the coding in office");
	}
}
//object has two state
//Object has two role
//Person (when he is sitting at home)
//Employee (office)
public class MyOverriding {
	
	public static void main(String args[])
	{
		//Behave a employee
		//if you are person also
		//(9 to 6)
		Person ansar=new Employee();
		//ansar.work("Ansar");
		
		
		//after 6
		Person b=new Person();
		b.work("Ansar");
	}

}
