package com.collection.com;
import java.util.Collections;
import java.util.LinkedList;
public class Solution 
{
	public static void main(String[] args) 
	{
	 LinkedList ll=new LinkedList();
	 ll.add("Look");
	 ll.add("Shajitha");
	 ll.add("Book");
	 ll.add("Alpha");
	 System.out.println(ll);
	 Collections.sort(ll);
	 System.out.println(ll);
	 System.out.println(Collections.binarySearch(ll,"Book"));
	}

}
