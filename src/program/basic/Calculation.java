package program.basic;

import java.util.Scanner;

public class Calculation extends Calculator
{

	public static void main(String[] args) 
	{
		double fn,sn;
		   Scanner ob=new Scanner(System.in);
		   System.out.println("Enter the two numbers:");
		   fn=ob.nextDouble();
		   sn=ob.nextDouble();
		   Calculator cal=new Calculator();
		   cal.setFirstNumber(fn);
		   cal.setsecondNumber(sn);
		  System.out.println("The addition is: " + cal.getAdditionResult());
		  System.out.println("The substraction is: " + cal.getSubtractionResult());
		  System.out.println("The multiplication is: " + cal.getMultiplicationResult());
		  System.out.println("The divisin is: " + cal.getDivisionResult());
		  
		 
	}

	}


