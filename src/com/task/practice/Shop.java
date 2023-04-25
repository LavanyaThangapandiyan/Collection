package com.task.practice;
import java.util.Scanner;
//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//Ask user for quantity Suppose, one unit will cost 100.
//Judge and print total cost for user.

public class Shop 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Quantity :");
	int  quantity=sc.nextInt();
	int total = quantity*100;
	Shop obj=new Shop();
	obj.discountCalculation(total);
	System.out.println(obj);
	}
	public void discountCalculation(int quantity)
	{
		int total;
		 if(quantity>1000)
		{	
			System.out.println("Total cost = " +quantity);
			total=(quantity-(quantity/100*10));//1100-(1100/100*10)->990
			System.out.println("The total cost with discount = "+total);
			}
			else
			System.out.println("The total cost = "+quantity);
	}
}


