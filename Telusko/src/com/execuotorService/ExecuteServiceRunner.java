package com.execuotorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// only one thred will run at a time
		//ExecutorService executorService=Executors.newSingleThreadExecutor();
		// two threads are active in any point in time
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		System.out.println("\n Task3 kicked off");
		for(int i=101;i<=199;i++) {
			System.out.print(i + " ");
		}
		System.out.println("Done task 3");
		System.out.println("Main Done");
		executorService.shutdown();

	}

}
