package com.capgimini.day2;

//Mobile
//by default interface is also abstract 
//if you add or not the abstract keyword .Java will take it as abstract only
abstract class Mobile {
//calling
//Abstract Method
//unimplemented Method	
//by default method will also be abstract
//you can or not the abstract keyword	
	public void calling() {
		System.out.println("Calling");
	}

	
abstract public void brand();
//sendSMS
//when you have abstract class it is complsary to give abstract keyword
	public void sendSMS() {
		System.out.println("Send SMS");
	}

//abstract and non abstract method
	public void charging() {
		System.out.println("C Type of Charging");
	}

}
//class to class is extends
//Interface(I)---> class (implemented)
//Implemented class

class MicroMax extends Mobile {
	// base class mobile
	// sub class apple
	// both base class and child class have the same method
	// @override (you are calling the method of child only)

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("MircoMax");
	}

}


class Bell extends Mobile {
	// base class mobile
	// sub class apple
	// both base class and child class have the same method
	// @override (you are calling the method of child only)

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("Bell");
	}

}

class Abc extends Mobile {
	// base class mobile
	// sub class apple
	// both base class and child class have the same method
	// @override (you are calling the method of child only)

	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("ABC");
	}

}



public class MyAbstraction {

	public static void main(String args[]) {
		
		//Create the object of interface or abstract class
		//but we need to give reference of implemented
		//it hold the reference to implemented class
		Mobile mircomax = new Abc();
		
		mircomax.calling();
		mircomax.sendSMS();
		mircomax.charging();
		mircomax.brand();
		Mobile bell = new Bell();
		bell.calling();
		bell.sendSMS();
		bell.charging();
		bell.brand();
		
		
		
	}
}
