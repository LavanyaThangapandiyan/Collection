package com.practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ExampleDate 
{
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date ");
		String date = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date2=null;
		    //Parsing the String
		    date2 = dateFormat.parse(date);		    
		    System.out.println(date2);
		  Date thisDate=new Date();
		  SimpleDateFormat dateForm=new SimpleDateFormat("MM/dd/Y h:mm a");
		   System.out.println(dateForm.format(thisDate));
	}

}
