package com.execuotorService;


import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MulitpleAnyCallableRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		// submit is used to execute multiple task of callable things 
		// wait for all of them to complete execution with  executor service		
		List<CallableTask> tasks=List.of(new CallableTask("Roopa"),
				new CallableTask("Veerayya"), new CallableTask("Malemath"));
		List<Future<String>> future=executorService.invokeAll(tasks);
		for(Future<String> f : future) {
			System.out.println(f.get());
		}
		executorService.shutdown();

	}

}
