package com.sunbeam;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee[] emp= {
				new Employee(1, "Ani"), 
				new Employee(2, "Bob"),
				new Employee(3, "Charu"),
				new Employee(4, "Dina")
		};
		System.out.println("Enter an employee id and name");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		Employee result = searchEmployee(emp,id,name);
		if (result != null) 
		{ 
			System.out.println("Employee found: " + result.getName() + " with ID: " + result.getEmpid());
			}
		else 
		{ System.out.println("Employee not found");
		}
    sc.close();
	}

	private static Employee searchEmployee(Employee[] emp, int id, String name) {
		for (Employee employee : emp) 
		{ 
			if (employee.getEmpid() == id && employee.getName().equals(name))
			{ return employee; 
			} 
			}
		return null;
	}
}
