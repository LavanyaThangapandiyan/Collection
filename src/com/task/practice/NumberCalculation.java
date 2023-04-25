package com.task.practice;

//Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ).
//Print average and product of all numbers.
import java.util.Scanner;

public class NumberCalculation 
{
	public void averageAndProductOfAllNumbers()
	{
		Scanner sc=new Scanner(System.in);
		int num,sum=0,pro=1;
		char ch;
		for(int i=1;i>=1;i++)
		{
			System.out.println("Enter A Number");
			num=sc.nextInt();
			pro = pro * num;//pro=1*5=5//5*6=30
			sum = sum + num;//sum=5+6=11
			System.out.println("to exit press q else n");
			ch=sc.next().charAt(0);
			if(ch == 'n')
				continue;
			else if (ch =='q')
				System.out.println("You have chosen to quit");
				break;		    
		}
		
		System.out.println("product is "+pro);
		System.out.println("the sum is "+sum);
	}

	public static void main(String[] args) 
	{
		NumberCalculation obj=new NumberCalculation();
		obj.averageAndProductOfAllNumbers();	
	}

}
