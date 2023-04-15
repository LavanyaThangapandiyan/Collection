package program.basic;

import java.util.Scanner;
public class Mark
{
	public static void main(String[] args) 
	{
	int count=0;
	int total=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	while(count<5)
	{ int mark;
		mark=sc.nextInt();
		total=total+mark;
		count=count+1;	
	}
	System.out.println((total));
	}

}
