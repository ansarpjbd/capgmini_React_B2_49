package com.cpg.day6;

//fixed the scope
//Generic class
//You can pass the type of data type of member variable 
//while creating the object
//with class you can take parameters <par1,par2,par3...> 
//Student become the generic class
class Student<A, B, C> {
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	public Student(A rollno, B name, C age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// loose coupling
	A rollno;
	B name;
	C age;

	// tight coupling
	// we cannot change or remove or modify the datatype of variable
	// int rollno;
	// String name;
	// int age;
}

public class MyGenericClass {

	public static void main(String args[]) {
		// Student class has fixed the type of variable
		//
		Student s1 = new Student(100, 100, 35);
		System.out.println(s1);

		// Business you can store the age a Long also
		// it took the variable type as paramters pass to constructor
		Student s2 = new Student(100, "Ansar", 24.4);
		System.out.println(s2);

		// Genric Class Object
		// Wrapper class
		// primitive data type
		//References to generic type Student<A,B,C> should be parameterized
		Student<Double, String, Double> s4 = 
				        new Student<Double, String, Double>
		                              (10.00, "Ansar", 22.00);
		System.out.println(s4);
	}

}
