package com.cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Demo1 {
	//Executor Pattern
	//using lamda expression no need to create seperate class
	public static void main(String args[])
	{
	Executor executor = Executors.newSingleThreadExecutor();
	Runnable r= ()->System.out.println("Run Method Executed by "+Thread.currentThread().getName());
	executor.execute(r);
	executor.execute(r);
	executor.execute(r);
	}
}