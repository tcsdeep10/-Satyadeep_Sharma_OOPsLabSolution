package com.greatlearning.week3.emailapp.driver;
	
import java.util.Scanner;

import com.greatlearning.week3.emailapp.credentialservice.CredentialService;
import com.greatlearning.week3.emailapp.employee.EmployeeName;

public class MainClassDriver {
	
	private static Scanner sc1;
	private static Scanner deptname;
	


	public static void main(String[] args) {
		
		EmployeeName emp1 = new EmployeeName("Satyadeep","Sharma","Tech");
	     System.out.println("Enter First name of employee");
	     sc1 = new Scanner(System.in);
	     String First_name =  sc1.next();
	     emp1.setFristname(First_name);
		
	     System.out.println("Enter Last name of employee");
	     sc1 = new Scanner(System.in);
	     String Last_name =  sc1.next();
	     emp1.setLastname(Last_name);
	    
	     System.out.println("Enter the department name");
	     System.out.println("Enter Tech for Techincal Department");
	 	 System.out.println("Enter Admin for Admin Department");
	 	 System.out.println("Enter HR for HR Department");
	 	 System.out.println("Enter Legal for Legal Department");
	     deptname = new Scanner(System.in);
	     String department =deptname.next();
	     emp1.setDeptname(department);
	     int length = 8;
	     
	     CredentialService credential = new CredentialService();
	     String email_id  = credential.generateEmailaddress(emp1);
	     String password = CredentialService.generatePassword(length);
	     credential.showCredentials(emp1, password, email_id);
	     
	}
	     
}