package com.evalQ2;

public class Student {
	private int roll;
	private String name;
	private String address;
	private int marks;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	Student(){
		
	}
	
	Student(int roll, String name, int marks, String address ){
		this.roll = roll;
		this.address=address;
		this.marks = marks;
		this.name = name;
	}
	
}
