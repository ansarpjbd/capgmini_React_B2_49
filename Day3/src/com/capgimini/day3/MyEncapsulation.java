package com.capgimini.day3;
//Encapsulation--Data hiding

//it is capsul and who ever is using the class it has to take full class
//only data member of class have the access to variable
//method can add and remove or update,delete the variable
//Real time
//Person 

//Money
//hiding 

//giveMoney()

//takeMoney()

class PersonA {
	private int money = 1000;

	public int giveMoney(int d) {
		return this.money - d;
	}

}

public class MyEncapsulation {

	public static void main(String args[]) {
		PersonA ansar = new PersonA();
		// ansar.money=1000;
		System.out.println("Ansar " + ansar.giveMoney(100));
	}
}
