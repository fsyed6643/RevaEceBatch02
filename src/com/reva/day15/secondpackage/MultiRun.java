package com.reva.day15.secondpackage;
//Program to demonstrate Creating thread using Runnable interface
public class MultiRun implements Runnable{
	
	public void run() {
	try {
		
		System.out.println("thread" +Thread.currentThread().getId()+"is running" );
	}
    catch(Exception e)
	{
    	System.out.println("Exception is caught");
	}
}
}