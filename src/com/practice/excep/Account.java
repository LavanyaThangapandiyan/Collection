package com.practice.excep;

import java.util.Scanner;

public class Account
{
	private static int balance=40000;
	public static long withdraw;
	public static long currentBalance=0;
	public void cashWithdraw(long withdraw)
	{
		try 
		{
			if(withdraw>40000)		
			throw new InSufficientBalanceException("Not enough Money");
			System.out.println("Your Money is Available");
			System.out.println("Please take your Cash....");
			currentBalance=balance-withdraw;
			System.out.println("Your Current Balance is :"+currentBalance);	
		}
		catch(InSufficientBalanceException e)
		{
			System.out.println("Your Balance is Low....");
		}
		finally
		{
			System.out.println("Your Minimum Balance is:"+balance);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Account obj=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your WithDraw Amount");
		withdraw=sc.nextInt();	
		obj.cashWithdraw(withdraw);

	}

}
