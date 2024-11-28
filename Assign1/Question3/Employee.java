package com.sunbeam;

public class Employee {
	private int empid;
	private String name;
	
	public Employee() {
	}
	public Employee(int empid, String name) {
		
		this.empid = empid;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	
	public String getName() {
		return name;
	}
	

}
