package com.capgimini.day2;

//Manually giving paper and taking not allowed
//Inheritance --allow us to use the code reusability
//extends --extends is used take the properites from one class to another  

//class 1   base   parent super
//class 2   child         sub

public class Student extends Person {
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", fees=" + fees + ", subject=" + subject + ", teacherName=" + teacherName + "]";
	}
	//
	public Student(long id, int fees, String subject, String teacherName,String name,String address, int age) {
		
		//Super method
		//call the constructor of base class
		super(name, age, address);
		this.id = id;
		this.fees = fees;
		this.subject = subject;
		this.teacherName = teacherName;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	private long id;
	private int fees;
	private String subject;
	private String teacherName;

}
