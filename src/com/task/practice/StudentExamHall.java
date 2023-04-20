package com.task.practice;
import java.util.Scanner;
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
            System.out.println("Enter your choise");
            System.out.println("1 : yes");
            System.out.println("2 : No");
            int choise=in.nextInt();
            switch(choise)
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

