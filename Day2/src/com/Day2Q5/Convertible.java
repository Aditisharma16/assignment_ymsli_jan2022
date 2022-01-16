package com.Day2Q5;

public class Convertible extends Car {
	private boolean isHeadOpen;
	
	Convertible(){
		
	}

	Convertible(boolean isHeadOpen) {
		this.isHeadOpen = isHeadOpen;
	}

	public boolean getisHeadOpen() {
		return isHeadOpen;
	}

	public void setHeadOpen(boolean isHeadOpen) {
		this.isHeadOpen = isHeadOpen;
	}
	
	public void display() {
	    super.display();
	    System.out.println("Is the car convertible: " + isHeadOpen);
	}

}
