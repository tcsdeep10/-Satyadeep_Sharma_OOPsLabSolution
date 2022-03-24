package com.greatlearning.week3.emailapp.employee;

public class EmployeeName {
	
	private String firstname;
	private String lastname;
	private String deptname;
	
	
	public EmployeeName(String fn , String ln, String dn)
	{
		this.firstname = fn;
		this.lastname=ln;
		this.deptname = dn;
	
	}
	
	public void setFristname(String f) 
	{
	this.firstname = f;
	}
	
	public void setLastname(String n) 
	{
	this.lastname = n;
	}
	
	public String getFristname() 
	{
	return firstname;
	}

	public String getLastname() 
	{
	return lastname;
	}
	public void setDeptname(String department) 
	{
	this.deptname = department;
	}
	
	public String getDeptname() 
	{
	return deptname;
	}
}