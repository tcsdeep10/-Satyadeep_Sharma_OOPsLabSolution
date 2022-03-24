package com.greatlearning.week3.emailapp.credentialservice;

import java.text.MessageFormat;
import java.util.Random;

import com.greatlearning.week3.emailapp.employee.EmployeeName;

public class CredentialService {
		
public static String generatePassword(int length) 
{

	String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$0123456789";
	
	char[] password=new char[length];
	Random random = new Random();
	
	for (int i=0;i<length;i++) 
	{
		password[i]=caps.charAt(random.nextInt(caps.length()));	
		
	}
	return new String (password);
}	
	
	public String generateEmailaddress(EmployeeName name) 
	{
		
		String fn = name.getFristname();
		String ln = name.getLastname();
		String dept = name.getDeptname();
		String emailid = fn+ln+"@"+dept+"."+"tcs"+"."+"com";
		return emailid;
		
	}    
	

	public void showCredentials(EmployeeName name, String password, String email_id) 
	{
		
		System.out.println("Dear"+" "+ name.getFristname() +" "+ name.getLastname()+" "+"your generated credentials are as follows");
		System.out.println("Email->"+ email_id);
		System.out.println(MessageFormat.format("Password->{0}", password));
		
	}
	
	
}