package com.student.gradecalculating;

import java.util.Scanner;
public class Student
{
	public String gradeCalculation(int total)
	{
		if(total>350)
			return "GRADE : A";
		else if(total>=300&&total<350)
			return "GRADE : B";
		else if(total>=250&&total<300)
			return "GRADE : C";
		else if(total>=175&&total<250) 
			return "GRADE : D";	
		else
			return "F (FAIL)"; 		
	}
	public static void main(String[] args)
	{
		int total = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks ");
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int mark4=sc.nextInt();
		int mark5=sc.nextInt();	
	 if(mark1<=100&&mark2<=100&&mark3<=100&&mark3<=100&&mark4<=100&&mark5<=100)
		{
	    if(mark1<0&&mark2<0&&mark3<0&&mark4<0&&mark5<0)
		{
	    total=mark1+mark2+mark3+mark4+mark5;
	    System.out.println("your total is "+total);
		}
		else
			System.out.println("Please Enter Valid Mark");
		
        Student obj=new Student();
        String grade = obj.gradeCalculation(total);
        System.out.println(grade);
		}
	}
}


