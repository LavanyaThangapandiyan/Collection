package com.practice.com;

import java.util.Scanner;

public class Vowel
{
	//Write a value-returning method, isVowel that 
	//returns the value true if a given character is a vowel, and otherwise returns false. 
	//In main() method accept a string from user and count number of vowels in that string.

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(isVowel(s.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static boolean isVowel(char letter)
	{
		switch(letter)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			return true;
		default:
		return false;
		}
		
		
	}
}
