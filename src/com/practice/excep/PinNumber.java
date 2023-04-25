package com.practice.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PinNumber {
	public void pinNumber()
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			
			System.out.println("Enter your Protected PIN Number:");
			long pin=sc.nextLong();
			System.out.println("Enter your Age");
			int age=sc.nextInt();
			System.out.println(" Your PIN Number is :" +pin+ "\n Your Age is"+age);
			System.out.println("Successfully Entered");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please Enter Valid Input");
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PinNumber obj=new PinNumber();
		obj.pinNumber();

	}

}
