package com.practice.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DobCalculation 
{
/*1. Write a program to get DOB from user and find the age in days, months and year.*/
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Date Of Birth in YYYY-MM-DD format: ");
		String input=sc.nextLine();
		LocalDate dob = LocalDate.parse(input);  
		DobCalculation obj=new DobCalculation();
		obj.dateOfBirthCalculation(dob);
	}
	public void dateOfBirthCalculation(LocalDate dob) 
	{
		LocalDate currentDate=LocalDate.now();
		Period period = Period.between(dob, currentDate);
	    int years = period.getYears();
	    int months = period.getMonths();
	    int days = period.getDays();
	    System.out.println("Your Age is: "+years);
	    System.out.println("Month "+months);
	    System.out.println(days+" Days");
	   
	    
	    }

}
