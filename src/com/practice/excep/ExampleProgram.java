package com.practice.excep;

public class ExampleProgram {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int number1=10,number2=20,result;
		
		try {
			int[] arr=null;
			System.out.println(arr[0]);
		    result=number1/number2;
		    System.out.println(result);
		}
		catch(ArithmeticException| NullPointerException e)
		{
		System.err.println(" Error Has Occurred");	
		}
		catch(Exception e)
		{
			System.out.println("Error Occurred");
		}
		finally {
		System.out.println("End of the Program");
		}
		System.out.println("Thanks...");
		

	}

}
