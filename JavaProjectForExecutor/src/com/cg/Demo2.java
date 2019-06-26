package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo2 {
	//Executor Pattern
	//using lamda expression no need to create seperate class
	public static void main(String args[])
	{
	//Using ExecutorService
	Runnable task1= ()->System.out.println("Th1 Service Pattern Run Method Executed by "+Thread.currentThread().getName());
	Runnable task2= ()->System.out.println("Th2 Service Pattern Run Method Executed by "+Thread.currentThread().getName());
	Runnable task3= ()->System.out.println("Th3 Service Pattern Run Method Executed by "+Thread.currentThread().getName());
	//ExecutorService executor = Executors.newSingleThreadExecutor();//can handle one thread at a time
	ExecutorService executor = Executors.newFixedThreadPool(8); //can handle 8 theads simultaneously
	executor.execute(task1);
	executor.execute(task2);
	executor.execute(task3);
	executor.execute(task3);
	executor.shutdown();//executorService has a method to shutdown the service or else the output will not shutdown / countinues
	}
}