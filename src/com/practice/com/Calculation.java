package com.practice.com;

public class Calculation 
{
	public static void main(String[] args)
	{
		Addition obj=new Addition();
		int addition = obj.addition(10, 20);
		System.out.println("Sum of two integer values "+addition);
	}
}
class Addition
{
	public int addition(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}
