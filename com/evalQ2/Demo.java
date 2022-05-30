package com.evalQ2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter total no of student:");
		int size = input.nextInt();
		Student students = new Student();
		Student[] s1 = new Student[size];
		for(int i=0; i<s1.length; i++) {
			System.out.println("enter name: ");
				students.setName(input.next());
			System.out.println("enter roll no");
			students.setRoll(input.nextInt());
			System.out.println("enter marks");
			students.setMarks(input.nextInt());
			System.out.println("Enter address:");
			students.setAddress(input.next());
			s1[i]= new Student(students.getRoll(),students.getName(),students.getMarks(), students.getAddress());
			
			
		}
	System.out.println(students);
		
	}

	
	
}
