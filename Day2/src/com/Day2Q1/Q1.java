package com.Day2Q1;
//Q1: Implement following UML diagram, Write a program to test circle class.

class Circle{
	public final double pi=3.14;
	private double radius;
	private String color;
	
	public Circle()
	{
		radius=1.0;
		color= "red";
	}
	
	public Circle(double r)
	{
		radius=r;
	}
	
	public double getRadius()
	{
		return radius;
	}
	public double getArea(double radius)
	{
		return pi*radius*radius;
	}
	
	
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c= new Circle(5);
		double radius= c.getRadius();
		System.out.println("radius of circle is : "+radius);
		double area=c.getArea(radius);
		System.out.println("Area of circle is :"+ area);
		
		
	}

}
