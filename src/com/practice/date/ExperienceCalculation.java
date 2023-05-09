package com.practice.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class ExperienceCalculation
{
	/*2. Write a program to get joining date of an employee, joined as software developer and moved a team lead.
    1.find the years the employee was as a software developer.
    2. Find the years of exp as team lean.
    3. Find the total experience in the company.*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Joining Date of Software Developer in YYYY-MM-DD Format");
		String date=sc.nextLine();
		LocalDate joinDate=LocalDate.parse(date);
		System.out.println("Enter the Date of moved a team lead in YYYY-MM-DD Format");
		String date1=sc.next();
		LocalDate teamLeadJoinDate=LocalDate.parse(date1);
		ExperienceCalculation day=new ExperienceCalculation();
		day.ExperienceCalculation(joinDate, teamLeadJoinDate);
	}
	public void ExperienceCalculation(LocalDate joinDate,LocalDate teamLeadJoinDate) 
	{
		LocalDate currentDate=LocalDate.now();
		Period period1=Period.between(teamLeadJoinDate, currentDate);
		int years2 = period1.getYears();
		Period period2=Period.between(joinDate, currentDate);
		int years = period2.getYears();
		int developerExp=years-years2;
		System.out.println("1.Your experience in this team Lead:  "+years2);
		System.out.println("2.Your experience in this software developer : "+developerExp);
		System.out.println("3.Your Total Year Of Experience in the Company : "+years);
		
	}

}
