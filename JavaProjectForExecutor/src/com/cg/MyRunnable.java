package com.cg;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Happy Birthday DON "+Thread.currentThread().getName());
	}
}
