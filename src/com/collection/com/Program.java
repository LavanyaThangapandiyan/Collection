package com.collection.com;
import java.util.ArrayList;
public class Program 
{	public static void main(String[] args) 
{
	ArrayList al=new ArrayList();
	al.add(50);
	al.add(40);
	al.add(10);
	al.add(30);
	al.add("Book");
	System.out.println(al);
	System.out.println("Array Size "+al.size());
	al.add(3, "Lav");
	System.out.println("After update the object "+al);
	System.out.println("Element is there or not "+al.contains(10));
	al.remove(3);
	System.out.println(" After Remove the element"+al);
	System.out.println("the index of 0 value is"+al.get(0));
	al.set(0, "Head");
	System.out.println("After set the value "+al);
	System.out.println("The position of 40 is "+al.indexOf(40));
	ArrayList al1=new ArrayList();
	al1.addAll(al);
	System.out.println(al+"\n"+al1);
	System.out.println(al1.subList(1,4));
	
	}
}
