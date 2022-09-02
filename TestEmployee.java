package com.oops.pll;

import com.oops.bll.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		
				Employee e1 = new Employee(112, "Bivor","Kumar",30000);
				
				System.out.println(e1);
				
				// Setters and Getters
				
				e1.setSalary(1000);
				
				System.out.println(e1);
				System.out.println("Id is "= +e1.getId());
				System.out.println("\nFirstname is : "+e1.getFirstName());
				System.out.println("\nLastname is : "+e1.getLastName());
				System.out.println("\nSalary is : "+e1.getSalary());
				System.out.println("\nName is : "+e1.getName());
				System.out.println("\n Annual Salary is : " +e1.getAnnualSalary());
				
				System.out.println("New Salary is :" +e1.raiseSalary(20));
				System.out.println(e1);
	}

}
