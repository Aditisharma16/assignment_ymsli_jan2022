package com.Day2Q5;

public class Car  extends Vehicle {
	private int noOfDoor;
	
	Car(){
		this.noOfDoor=4;
		
	}
	
	Car(int noOfDoor){
		this.noOfDoor= noOfDoor;	
	}
	
	public void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}
	
	public void display() {
		System.out.println("Number of Doors: "+ noOfDoor);
		System.out.println("Make: "+ super.getMake());
		System.out.println("Make: " + super.getModel());		
	}

	

}
