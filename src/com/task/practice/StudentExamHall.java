package com.task.practice;
import java.util.Scanner;

//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
//Take following input from userNumber of classes held Number of classes attended.
//And print percentage of class attended Is student is allowed to sit in exam or not.
//Also decide to allow student to sit if he/she has medical cause.
//Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly

public class StudentExamHall 
{
	public void studentAllowExamHall()
	{
		Scanner in=new Scanner(System.in); 
        System.out.println("Enter the number of class");
        int n=in.nextInt();
        System.out.println("Enter the number of class attend");
        int a=in.nextInt();
        float pf=(a*100)/n;
        System.out.println("percentage : " +pf);
        if(pf<75)
         {
            System.out.println("Are you medical cause?");
            System.out.println("Enter your choice");
            System.out.println("IF yes PRESS 1");
            System.out.println("OTHERWISE PRESS 2 ");
            int choice=in.nextInt();
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
	public static void main(String[] args)
	{
		StudentExamHall obj=new StudentExamHall();
		obj.studentAllowExamHall();
	}	
}

