package com.day7.q1;



class Multithread implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=100;i++)
		{
			System.out.println("["+ Thread.currentThread().getName()+":"+ i+ " ]");
		}
		
	}
	
}
public class Q1 {

	public static void main(String[] args) {
		Multithread job=new Multithread();
		
		Thread t1=new Thread(job,"Thread1");
		Thread t2=new Thread(job,"Thread2");
		Thread t3=new Thread(job,"Thread3");
		
		t1.start();
		t2.start();
		t3.start();
	}

	
}
