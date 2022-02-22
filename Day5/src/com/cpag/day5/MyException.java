package com.cpag.day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//Error
//Exception

//Real Time : Word document
//keyword stop working 
//(Error) which force system to shut down (stop the work)
//We cannot do anything becuase there is no alter native
//Power failure , Display not working 
//(Exception)
//Have a External Keyboard and coutiune with work
//We have do the alternative to follow the work

//Java Program

//error--program stop executing 

//Exception--we can handle the exception
//java.io.Serializable(I)-->Java.lang.Throwable(Class)-->Exception

//Rule: exception will throw by classes
//each class have their own exception

//String --NUll pointer exception
//Exception

//RuntimeException--->java.lang.NullPointerException(C);

//IOException--
//Exception

//Checked Exception
//those exception which throw at runtime 
//compiler will not able to catch or understand it
//File not Found
//io exception
		//Class Not Found
		//Sql Exception

//Unchecked Exception 
//it is like error(not error)
//at compiler throw at error
//either we have to handle it or we need to throw
//code will not compile
//RuntimeException 
//Handle 
//try 
//catch block

public class MyException {

	public static void main(String args[]) 
	{
	
		
//if code execute fine then try block will execute 
		
		//Unchecked exception
		//which is throw at runtime
		
		
		
		int a=10;
		int b=0;
		//Arithmetic
		//divide --divide with
		//System.out.println(a/b);
		//java.lang.ArithmeticException
		
		
		int arr[]=new int[5];
		//arr[10]=10;
		//trying to access the location  
//	Execption->	RuntimeException-->	IndexOutOfBoundsException-->java.lang.ArrayIndexOutOfBoundsException
		
		String s1="Abc";
		String s2=s1;
		String s=null;
		try
		{
			
			String str="h";
			//java.lang.StringIndexOutOfBoundsException
			//Null Pointer Exception
			System.out.println(str.charAt(10));
			
			
			 //Unhandled exception type FileNotFoundException	
			   FileInputStream inputStream=new FileInputStream("D://text.txt");
				
			
			//Exception 
			System.out.println(s.toUpperCase());	
			//create object of null pointer exception
		}
		//break on code then catch block will execute
		//class (NullPointerException)
		//creating the object of Null Pointer Exception
		//    class name              object name
		catch(NullPointerException myNullPointerexception)
		{
			//System.out.println("Exception in your code");
			s="hello";
			System.out.println(s);
			
		//System.out.println(myNullPointerexception.getMessage());
			//SystemmyNullPointerexception.getStackTrace();
		//	System.out.println(myNullPointerexception.getStackTrace());
		}
		
	
		catch(FileNotFoundException fileException)
		{
		  fileException.printStackTrace();	
		}
		catch(IOException io)
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//multiple catch block
		//Parent class should be blow of child class
		//Unreachable catch block for FileNotFoundException. It is already handled by the catch block for IOException
		//Exception is parent class of every class
	}
}
