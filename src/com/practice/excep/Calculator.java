package com.practice.excep;

import java.util.Scanner;
public class Calculator
{
	double number1,number2,result;
 
	public void operator(String operator) 
	{
		double number1,number2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		if(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))
		{
			if(operator.equals("+"))
			{
				result=number1+number2;
				System.out.println(result);
				 
			}
			else if(operator.equals("-"))
			{
			result=number1-number2;
			System.out.println(result);
			
			}
			else if(operator.equals("*"))
			{
				result=number1*number2;
				System.out.println(result);
				
			}
			else
			{
				result=number1/number2;
				System.out.println(result);
				
			}
		}System.out.println(number1 + operator + number2 + "=" +result);
			
		
	}
	public static void main(String[] args) throws InvalidOperatorException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Operator : +,-,*,/ ");
		String operator=sc.nextLine();
		Calculator obj=new Calculator();
		obj.operator(operator);
		try
		{
		if(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("-")&&!operator.equals("/"))	
		throw new InvalidOperatorException("Invalid");	
		}
		catch(InvalidOperatorException e)
		{
			System.out.println("Invalid Operator Exception");
		}
		finally {
			System.out.println("Thanks for Using this Application....");
		}
	}

}
