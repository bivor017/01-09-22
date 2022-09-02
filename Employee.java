package com.oops.bll;

public class Employee {
	
		private int id;
		private String firstName;
		private String lastName;
		private double salary;
		
		public Employee(){
			
			// default constructor
		}
		
		public Employee( int id, String firstName, String lastName, double salary){
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary =salary;
			
		}
		
		public int getId() {
			return id;
		}
		
		public String getFirstName() {
			return firstName;
			
		}
		
		public String getLastName() {
			return lastName;
			
		}
		
		public double getSalary() {
			return salary;
			
		}
		
		public void setSalary(double salary) {
			this.salary =salary;
		}
		
		public double getAnnualSalary() {
			return salary*12;
			
		}
		
		public double getraiseSalary(int percent) {
			return getAnnualSalary()+(salary*(percent)/100);
			
		}
		
		
		//@ over ride
		
		 public String toString() {
			return ""+"Employee id: "+id+" \nName: "+firstName+" "+lastName+" \nSalary : "+salary;
		}
		
}
