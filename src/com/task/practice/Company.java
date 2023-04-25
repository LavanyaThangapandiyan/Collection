package com.task.practice;
import java.util.Scanner;
//A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount.
public class Company 
{
    static Scanner sc=new Scanner(System.in);
	public static int year;
	public static int salary;	
	public static void main(String[] args) 
	{      
	System.out.println("please Enter your year of Service: ");
    year=sc.nextInt();
    Company obj=new Company();
    double bonusCalculation = obj.bonusCalculation(year);
    System.out.println("Your 5% Bonus is :" +bonusCalculation);
    double bonus=bonusCalculation+salary;
    System.out.println("Your NET BONUS With Salary is : "+bonus);
	}
	public double bonusCalculation(int year)
	{
		double sal;
		if(year>5)
		{
			System.out.println("Enter your Salary amount: ");
			salary=sc.nextInt();
			sal=salary*0.05;
			System.out.println("Your Salary is : "+salary );
			return sal;
		}
		else
			System.out.println("No Bonus...");
		return 0;	
	}
}
