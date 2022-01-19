package com.Q2;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}

	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(Date date)
	{
		this.day=date.day;
		this.month=date.month;
		this.year=date.year;
	}
	
	
	
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
