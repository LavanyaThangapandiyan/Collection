package com.collection.com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetDemo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit:");
		int num=sc.nextInt();
		System.out.println("Enter the values:");
		ArrayList l=new ArrayList();
		for(int i=0;i<num;i++)
		{
		l.add(sc.nextInt());		
		}
		System.out.println(l);
		HashSet hs=new HashSet(l);
		System.out.println("After removing Duplicate:"+hs);
		LinkedHashSet lhs=new LinkedHashSet(hs);
		System.out.println(lhs);
		}

}
