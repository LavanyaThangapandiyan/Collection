package com.task.practice;
import java.util.Scanner;
public class Shop 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Quantity :");
	int  no=sc.nextInt();
	Shop obj=new Shop();
	double discountCalculation = obj.discountCalculation(no);
	System.out.println("Your Cost is: "+discountCalculation);
	}

	public double discountCalculation(int value)
	{
		double quantity=value;
		double total;
		if(quantity>1000)
		{	
		total=(quantity-(quantity/100*10));
		return total;
		}
		else
			return value;
	}
}
