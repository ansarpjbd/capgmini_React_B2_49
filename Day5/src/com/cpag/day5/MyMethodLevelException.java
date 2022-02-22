package com.cpag.day5;

//throws it is used to catch the exception at method level
//which ever method is calling the exception need to handle the exception
//Chain exception
class MethodLevelException 
{
	
	//this will throw the exception
	public void myException() throws Exception
	{
		
			int a=10;
			int b=0;
			System.out.println(a/b);
		
	}
}


public class MyMethodLevelException {
	
	
	//Now it is compiler reposibilty to handle the exception
	//Main method call the compiler
	public static void main(String args[]) throws Exception
	{
		
		
		
		MethodLevelException exception=new MethodLevelException();
		
		//this method calls the method which has the exception
		//needs to handle the exception
		exception.myException();
		
		
	}

}
