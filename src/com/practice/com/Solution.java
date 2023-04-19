package com.practice.com;

import java.util.Scanner;

//Write a program with a method named getTotal that 
//accepts two integers as an argument and return its sum.
//Call this method from main( ) and print the results.
public class Solution {
	public int getTotal(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Solution ss=new Solution();
		int sum=ss.getTotal(a, b);
		System.out.println(+sum);

	}

}
