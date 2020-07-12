package com.execuotorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// how to return values from threads
// create a task which would return our value back
// for implementing task which returns value

class CallableTask implements Callable<String>{
	
	private String name;

	public CallableTask(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	// when call finishes return this value
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
		return "Hello" + name;
	}
	
}

public class CallableRunner {
	public static void main(String[] a) throws InterruptedException, ExecutionException {
		ExecutorService executorService=Executors.newFixedThreadPool(1);
		// submit is used to execute callable things 
		// something returns a value ten you need to use submit
		// future is nthing but promise  we will have result at later point intime
		Future<String> future=executorService.submit(new CallableTask("Roopa"));
		System.out.println("new callable Roopa is executed");
		// get wait for task execution completeion 
		String welcome=future.get();
		// only after the completing the execution it will execute this line 
		System.out.println(welcome);
		System.out.println("Main completed");
		executorService.shutdown();
		
		
	}

}
