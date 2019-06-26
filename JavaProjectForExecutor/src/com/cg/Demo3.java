package com.cg;

import java.util.List;
import java.util.*;
import java.util.concurrent.*;
import java.util.ArrayList;

public class Demo3 {
	
	public static void main(String args[])
	{
		ShareMarket sm =new ShareMarket();
		ExecutorService executor=Executors.newFixedThreadPool(10);
		List<Future<Double>> reslist=new ArrayList<>();
	
		for(int i=1;i<=5;i++)
		{
			Future<Double> f=executor.submit(sm);
			//automatic thread creates,startes and calling method call()
			//call() method returns double price stored as Future <Double> 
			reslist.add(f);			
		}
		try
		{
			executor.awaitTermination(5, TimeUnit.SECONDS);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		executor.shutdown();
		double price=0.0;
		int i=0;
		for(Future<Double>f:reslist)
		{
			try
			{
				price=f.get();
			}catch(InterruptedException|ExecutionException e)
			{
				e.printStackTrace();
			}
			System.out.println("Price "+(++i)+" is= "+price);
		}
	
	}
}