package com.practice.date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateProgram 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		DateProgram obj=new DateProgram();
		obj.checkingEligibleDate();
		obj.checkingEligibleYear();	
	}
	public void checkingEligibleDate()
	{
		Date date=new Date();
		int date2 = date.getDate();
		Date date1=new Date(2023,5,9);
		int date3 = date1.getDate();	
		if(date3==date2)
			System.out.println("Valid");
		else
			System.out.println("InValid");
	}
	public void checkingEligibleYear()
	{
		LocalDate now=LocalDate.now();
		int year = now.getYear();
		Date date1=new Date(2023,9,5);
		int year2 = date1.getYear();	
		if(year2==year)
			System.out.println("Valid");
		else
			System.out.println("InValid");
	}
	
}
