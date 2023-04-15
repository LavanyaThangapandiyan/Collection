package com.collection.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentMark 
{
	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     List<Integer> al = new ArrayList<>();
	 System.out.println("Enter your total number of Subject :");
	 int num=sc.nextInt();
	 System.out.println("Enter your marks");
	 for(int i=0;i<num;i++)
	 {
		al.add(sc.nextInt());	
	 }
	 int sum = 0;
	 System.out.println("Your Mark is "+al);
     for (int number : al)
     {
         sum += number;
	 }
	 System.out.println("Your Total is ["+sum+"]");
	 double per;
	 per=sum/num;
	 System.out.println("your percentage is [" +per+"%]");
	}
	
}
