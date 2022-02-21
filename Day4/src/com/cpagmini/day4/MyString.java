package com.cpagmini.day4;

public class MyString {
	
	public static void main(String args[])
	{
		//it is class in java
		//there are many method belong to class which we can use
		//String is final class-it means it can not be extends
		
		//first way by creating the string class object 
		String s1=new String("Hello");
		
		//by creating the string class variable
		String s2="Hello";
		
		//compare and see both are equal
		
		//primitive use ==
		//it will care the value
		//it will compare the datatype also
		//String equal method
		//value are equal
		//but both behave as different data type
		if(s1==s2)
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("No equal");
		}
		//equal compare only the value
		//both are equal
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("No equal");
		}
		//it will return the length of char
		System.out.println(s1.length());
		//if both string are equal return zero
		//if first string is greater than second it will return positive number with difference
        //if first String is less than second number 
		//return diff in -1
		System.out.println(s1.compareTo(s2));
		//System.out.println(s1.);
		
		//it will return true and false
	     //String start with zero
		System.out.println(s1.charAt(1));
		//it will combine two string class
		s1=s1.concat(" Java");
		System.out.println(s1);
		
		System.out.println(s1.startsWith("H"));
		System.out.println(s1.endsWith("o"));
		//search for string string inside string
		//if it contains then return true
		//else it return false
		System.out.println(s1.contains("khs"));
		
		//it will tell if string contain somthing or not
		s1.isBlank();
		s1.isEmpty();
		//it will find the given char and replace with new char 
		s1=s1.replace("H", "J");
		System.out.println(s1);
		
		//it will break the string using space or given
		//s1.split();
		//it will return one string which is part of main string
		System.out.println(s1.substring(2));
		
		//one take the start value index
		//two index--start and end index
		
		//convert the string to upper case
		System.out.println(s1.toUpperCase());
		
		//convert the string to lower case
		System.out.println(s1.toLowerCase());
 
		//convert the string to char array
		char[] c=s1.toCharArray();
		
		System.out.println(c[0]);
	}

}
