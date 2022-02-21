package com.cpagmini.day4;

public class MyStringBuilder {

	public static void main(String args[])
	{
		//String 
		//Immutable --cannot change
		//Not Thread Safe
		
		//String Buffer
		//mutable 
		//Not Thread Safe
		
		//String Builder
		//mutable
		//Thread Safe
		
		//you have to use StringBuffer Constructor
		StringBuilder sb=new  StringBuilder("Hello");
		
		sb.append(" Java");
		
		sb.delete(0, 0);
		
		sb.reverse();
		
		
	}
}
