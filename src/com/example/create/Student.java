package com.example.create;

import java.util.Scanner;

public class Student implements StudentExamination{

	public static void main(String[] args)
	{
		Student obj=new Student();
		System.out.println("\n Attendance Calculation:");
		obj.attendanceDetails();
		obj.permissionToexam();
		System.out.println("\n Total and Percentage Calculation:");
		obj.totalAndPercentageCalculation();
		System.out.println("\n Use this Only if you have total marks of 5 subject. ");
		System.out.println("\n Grade Calculation:");
		obj.gradeCalculation();
		System.out.println("\n Thanks for using this...");
	}
	public void attendanceDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of class");
        int n=sc.nextInt();
        System.out.println("Enter the number of class attend");
        int a=sc.nextInt();
        float pf=(a*100)/n;
        System.out.println("percentage : " +pf);
		
	}
	@Override
	public void permissionToexam()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your attendance Percentage");
	 float per=sc.nextFloat();
	 if(per<75)
     {
        System.out.println("Are you medical cause?");
        System.out.println("Enter your choice");
        System.out.println("IF yes PRESS 1");
        System.out.println("OTHERWISE PRESS 2 ");
        int choice=sc.nextInt();
        switch(choice)
        {
           case 1:
               System.out.println("you can sit an exam");
               break;
           case 2:
               System.out.println("you can't sit an exam");
               break;
           default:
               System.out.println("If any other is pressed");        
        }
           }
     else
        System.out.println("You can sit in examination room");   	
	}

	@Override
	public void totalAndPercentageCalculation() 
	{
		int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i=0; i<n; i++)
        {
            marks[i]=s.nextInt();
            total =total + marks[i];
        }
        percentage = total/n;
        System.out.println("Total :"+total);
        System.out.println("Percentage:"+percentage);
	}

	@Override
	public void gradeCalculation()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your total :");
		int total=sc.nextInt();
		if(total>450)
			System.out.println( "GRADE : A");
		else if(total>=400&&total<450)
			System.out.println("GRADE : B");
		else if(total>=350&&total<400)
			System.out.println( "GRADE : C");
		else if(total>=175&&total<350) 
			System.out.println("GRADE : D");	
		else
			System.out.println("F (FAIL)"); 	
		
	}

	

}
