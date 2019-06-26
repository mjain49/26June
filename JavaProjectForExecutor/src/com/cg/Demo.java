package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo {
	//Executor Pattern
	public static void main(String args[])
	{
	Runnable r=new MyRunnable();
	Executor executor = Executors.newSingleThreadExecutor();
	executor.execute(r);
	executor.execute(r);
	executor.execute(r);
	//lifecycle will handle only one thread at a time
		//there for only After completion of first the next exeutor.execute will again
		//run the next thread
		
	}
}