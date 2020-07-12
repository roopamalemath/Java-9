package com.execuotorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MultipleThreadDemoMainClass extends Thread {

	private int number;

	public MultipleThreadDemoMainClass(int number) {
		this.number = number;
	}

	public void run() {
		System.out.println("\n task " + number + "Started");
		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.println(i + " ");
		}

		System.out.println("task" + number + "Done ");
	}
}

public class MultipleThreadDemo{
	public static void main(String[] a) {
		// execute a service with specific number of active threads
		// at apoint in time only these many threads would be active at a maximum
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.execute(new MultipleThreadDemoMainClass(1));
		executorService.execute(new MultipleThreadDemoMainClass(2));
		executorService.execute(new MultipleThreadDemoMainClass(3));
		executorService.execute(new MultipleThreadDemoMainClass(4));
		executorService.shutdown();
		
	}
	
}
