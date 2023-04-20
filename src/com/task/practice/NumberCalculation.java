package com.task.practice;

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
			pro = pro * num;
			sum = sum + num;
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
