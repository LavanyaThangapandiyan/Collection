package com.practice.com;

public class Customer 
{
	int CustomerId;
	String CustomerName;
	String CustomerLocation;
	
	 Customer(int CustomerId,String CustomerName,String CustomerLocation)
	{
		 this.CustomerId=CustomerId;
		 this.CustomerName=CustomerName;
		 this.CustomerLocation=CustomerLocation;
	}
	 void display()
	 {
		 String CustomerName="Raj";//Assign local variable 
		 System.out.println("Customer ID : "+CustomerId);
		 System.out.println("Customer Name : "+CustomerName);
		 System.out.println("Customer Name : "+this.CustomerName);//get instance variable value
		 System.out.println("Customer Location : "+CustomerLocation);
	 }
	public static void main(String[] args) 
	{
		Customer cs=new Customer(1000,"Kavin", "Madurai");
		cs.display();   
	}

}
