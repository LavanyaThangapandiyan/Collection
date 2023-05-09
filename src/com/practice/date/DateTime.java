package com.practice.date;

import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		Date d1=new Date(2023,5,9);
		Date d2=new Date(2022,5,2);
		System.out.println("Date d1 is after d2:"+d1.after(d2));	
		System.out.println("Date d2 is before d1:"+d2.before(d1));
        System.out.println("Comparision value:"+d1.equals(d2));
        System.out.println("Comparision :"+d1.compareTo(d2));
        System.out.println("Get Year"+d1.getYear());
        System.out.println("Get Month"+d1.getMonth());
        System.out.println("Get Date"+d1.getDate());
        System.out.println(date.getTime());
        System.out.println(date.toString());
        System.out.println(date.clone());
        System.out.println(java.time.LocalDate.now()); 
        long millis=System.currentTimeMillis();  
       
	}

}
