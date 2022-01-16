package com.Day2Q4;

public class Student {

	private String studentName;
	private double studentID;
	private String grade;

	Student() {
		this.studentName = "Default";
		this.studentID = 11111;
		this.grade = "o";
	}

	Student(String studentName, String grade, double studentId) {
		this.studentName = studentName;
		this.studentID = studentId;
		this.grade = grade;
	}

	Student(String studentName, double studentID) {
		this.studentName = studentName;
		this.studentID = studentID;
	}

	Student(double studentID) {
		this.studentID = studentID;
	}

	void display() {
		System.out.println("Student Name: " + studentName);
		System.out.println("Student ID: " + studentID);
		System.out.println("Student Grade: " + grade);
	}

}
