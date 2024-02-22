package com.reva.day06;
//static variable program no need to define object
public class Employee {
	// Declare instance variables.
	private String name;
	private int id;
	
	// Declare a static variable companyName with data type String and assign value
	// TNS which is common for all the objects.
	static String companyName = "TNS";
	static float salary = 9999.99f;

	// Declare a two-parameter constructor with parameters named n and i.
	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString(){  // to assign the parameters while assigning
		return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
	}

	

}
