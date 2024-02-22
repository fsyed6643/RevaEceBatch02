package com.reva.day04.secondpackage;

import com.reva.day04.firstpackage.*;

public class Executor {

	public static void main(String[] args) {
		
		
		Person obj = new Person();
		
		obj.setAge(23);
		obj.setCity("Bangalore");
		obj.setName("kumar");
		
		System.out.println(obj);
		
		Base obj2 = new Base();
		
		obj2.varPublic = 100;
		obj2.methodPublic();
		
		

	}

}