package com.collection.com;

import java.util.HashSet;
import java.util.Set;

public class SetInterface
{

	public static void main(String[] args)
	{
	Set<Integer> s=new HashSet<>();
	s.add(5);
	s.add(9);
	s.add(8);
	s.add(10);
	System.out.println("First Set "+s);
	Set<Integer> s1=new HashSet<>();
	s1.add(8);
	s1.add(26);
	s1.add(17);
	s1.add(10);
	System.out.println("Second Set "+s1);
	s.addAll(s1);
	System.out.println("Union "+s);
	

	}

}
