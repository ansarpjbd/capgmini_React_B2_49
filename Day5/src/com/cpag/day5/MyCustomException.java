package com.cpag.day5;

import java.util.Scanner;

//Custom Exception 
//User defined Exception

//Business 
//User Should be able to enter the positive number
//if any negative number is entered throw exception

//Rule --Create a class 
//2 --extends this class with Exception class
//THen call the super class constructor
//pass the message from constructor to super class constructor
class OnlyPositiveNumberAllowed extends Exception {
	public OnlyPositiveNumberAllowed(String msg) {
		super(msg);
	}
}

public class MyCustomException {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println(num);
		} else {
			try {
				throw new OnlyPositiveNumberAllowed("Only Positive number are allowed ");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
