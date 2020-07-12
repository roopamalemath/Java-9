package com.execuotorService;

class Task1 extends Thread{
	public void run() {
		System.out.println("task1 started");
		for(int i=101;i<=199;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Done");
	}

}

class Task2 extends Thread{
	public void run() {
		System.out.println("task2 started");
		for(int i=301;i<=399;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Done");
	}

}

