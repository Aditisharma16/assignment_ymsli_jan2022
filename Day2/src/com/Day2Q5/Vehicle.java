package com.Day2Q5;

public class Vehicle {
	private int noOfWheel;
	private int noOfPassengers;
	private int model;
	private String make;
	
	Vehicle(){
		this.noOfWheel=4;
		this.noOfPassengers=5;
		this.model=476;
		this.make="latest";	
	}
	
	Vehicle(int noOfWheel, int noOfPassengers, int model, String make){
		this.noOfWheel= noOfWheel;
		this.noOfPassengers= noOfPassengers;
		this.model= model;
		this.make= make;
	}
	
	public int getNoOfWheel() {
		return noOfWheel;
	}

	public void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}

	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	public void setNoOfPassengers(int noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void display() {
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("No of wheels: "+ noOfWheel);
		System.out.println("No of Passangers: " + noOfPassengers);
	}
	

}
