package com.spring.di;

public class Employee {
	
	
	


	private int eid;
	private String name;
	private String cmp;
	private String email;
	private int salary;
	
	public Employee(int eid, String name, String cmp, String email, int salary)
	{
		
		this.eid = eid;
		this.name = name;
		this.cmp = cmp;
		this.email = email;
		this.salary = salary;
		
		System.out.println("Constructor called...");
	}

	
	
	/*
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCmp(String cmp) {
		this.cmp = cmp;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    */
	
	void Disp_Emp()
	{
		System.out.println("--------------------------------");
		System.out.println("Employee ID : "+eid);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Email : "+email);
		System.out.println("Employee Company : "+cmp);
		System.out.println("Employee Salary : "+salary);
		System.out.println("-------------------------------");
		
	}
	
}
