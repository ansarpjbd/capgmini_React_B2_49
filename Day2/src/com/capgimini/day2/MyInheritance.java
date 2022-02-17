package com.capgimini.day2;

public class MyInheritance {

	
	public static void main(String args[])
	{
		//example of single level
		//Person --->Student 
		//Student s1=new Student(1001, 100, "Java","Ansar", "Ajay","Chennai" ,18);
		//student class
		//System.out.println(s1);
		//Person class
		//System.out.println(s1.getName());
		//System.out.println(s1.getAge());
		//System.out.println(s1.getAddress());
		
		//MultiLevel 
		//Person -->Student -->Player 
		//Player player=new Player(1001, 100, "Java","Ansar", "Ajay","Chennai" ,18,"P101","Footbal");
	//	System.out.println(player);
		//System.out.println("Student Name "+player.getName());
	//	System.out.println("Student ID "+player.getId());
		
		//Multiple 
		//Student  -->Person
		Student s1=new  Student(1001, 100, "Java", "Ansar", "Ajay", "Chennai", 18);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		
		
		Player player=new Player("Ajay", "Chennai", 18, "P101", "Footbal");
		System.out.println(player.getName());
		System.out.println(player.getPlayerid());
		
	}
}
