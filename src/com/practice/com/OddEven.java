package com.practice.com;

import java.util.Scanner;

public class OddEven {

	//Write a method named isEven that accepts an int argument. 
	//The method should return true if the argument is even, or false otherwise. 
	//Also write a program to test your method.
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int no=0;
    no=sc.nextInt();
	if(isEven(no))
	System.out.println("number is even");
	else
		System.out.println("Number is odd");
	}
public static boolean isEven(int a)
{
	if(a%2==0)
	return true;
	else
	return false;	
}

}
