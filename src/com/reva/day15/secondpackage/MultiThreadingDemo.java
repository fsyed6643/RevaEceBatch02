package com.reva.day15.secondpackage;

public class MultiThreadingDemo {

	public static void main(String[] args) {

         int n =7; // no of threads
         for(int i=0; i< n; i++)
         {
        	 Mulithreading obj = new Mulithreading();
        	 obj.start();
         }
         

	}}

