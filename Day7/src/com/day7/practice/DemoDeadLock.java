package com.day7.practice;


public class DemoDeadLock {

	
	public static void main(String[] args) {
	
		final String r1 = "resource1";
		final String r2 = "resource2";
		
		Thread t1= new Thread(new Runnable(){
			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread1 get lock on r1");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
						System.out.println("thread1 get lock on r2");
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (r1) {
					System.out.println("thread2 get lock on r2");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
					}
					synchronized (r2) {
					System.out.println("thread2 get lock on r1");
					}
				}
			}
		});

		t1.start();
		t2.start();
			
		}

	}


