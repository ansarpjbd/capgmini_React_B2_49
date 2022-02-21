package com.cpagmini.day4;

public class MyStringNewConcept {

	
	public static void main(String args[])
	{
		//String immutable
		//this created issue using the string class
		
		
		//take a string and i need to change or update it
		//StringBuffer
		
		//it is class 
		//it is also used to store the string
		//char array
		//it is mutable (you can change or update the value)
		
		//use the constructor to create the object of string buffer
	    
		StringBuffer sbf=new StringBuffer("Hello");
		
		
		//use method with StringBuffer class
		//two thread accessing the same value 
		sbf.append(" Java");  sbf.delete(0, 0);
		
		sbf.append(" Hello ");
		sbf.append("124");
		
		sbf.charAt(0);
		sbf.length();
		
		System.out.println(sbf);
		System.out.println(sbf.reverse());
		
		//set the char at particular location
		//sbf.setCharAt(0, 0);
		
		
		
		//it will delete the char from string using index
		//you can start and end index
		
		sbf.delete(0, 0);
		//it will start index
        sbf.deleteCharAt(5);
        
        //it will compare two string value
        sbf.compareTo(sbf);
        
        sbf.equals(sbf);
        
         //args   
        //sbf.insert(0, false)
        
        //sbf.replace(0, 0, null);
        
        
        
		System.out.println(sbf);
		sbf.append(" hello");
		System.out.println(sbf);
		//StringBuffer   -->    String
		//Cannot convert the String to StringBuffer
		//Cannot  type also
		//StringBuffer sf=(StringBuffer)"Hello";
		
		//Once it is created we cannot change the value(Append)
		String s1="Hello";
		//New String
		//it will create the new string in pool
		//take new variable to hold the reference 
		String s2=s1.concat(" Java");
		String s3="Hello "+"Java";
		
		//System.out.println(s2);
		
		
	}
}
