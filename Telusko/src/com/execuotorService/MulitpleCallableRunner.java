package com.execuotorService;


import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MulitpleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException{
		// TODO Auto-generated method stub
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		// submit is used to execute multiple task of callable things 
		// wait for all of them to complete execution with  executor service		
		List<CallableTask> tasks=List.of(new CallableTask("Roopa"),
										new CallableTask("Veerayya"), 
										new CallableTask("Malemath"));
		// it would wait till any of the task is completed 
		String future=executorService.invokeAny(tasks);
		System.out.println(future);
		executorService.shutdown();

	}

}
