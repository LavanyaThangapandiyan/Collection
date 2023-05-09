package com.practice.date;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ApplyExam 
{
	public boolean checkingYearToEligible()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Here Enter the Year of complete the SSLC Exam");
		int year=sc.nextInt();
		LocalDate now=LocalDate.now();
		LocalDate earlier=now.minusYears(3);
		int year1 = earlier.getYear();
		if(year1==year)
		return true;
		else
		return false;
	}
	
	public static void main(String[]args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("If you Want to Check  you are Eligible Or Not:");
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter your SSLC MARK:");
		int mark=sc.nextInt();
		ApplyExam app=new ApplyExam();
		boolean check=app.checkingYearToEligible();
		if(check==true)
		{
			System.out.println("your Name is:"+name);
			System.out.println("your SSLC mark is:"+mark);
			System.out.println("You are Eligible");
		}
		else if(check==false)
			System.out.println("If you have SSLC Exam Complete in 2020 you Eligible \n You are Not Eligible");
		
	}
	
	
}
