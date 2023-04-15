package com.collection.com;
import java.util.ArrayList;
import java.util.Collections;
public class List 
{
	public static void main(String[] args)
	{
		 ArrayList  nm= new ArrayList();
		 nm.add("Bharathi");
		 nm.add("Lavanya");
		 nm.add("Kayal");
		 nm.add("Vaish");
		 nm.add("Shaji");
		 System.out.println(nm);
		 Collections.sort(nm);
		 System.out.println("Alphabetic Order");
		 System.out.println(nm);
		 ArrayList sub=new ArrayList();
		 sub.add(23);
		 sub.add(20);
		 sub.add(22);
		 sub.add(18);
		 sub.add(25);
		 System.out.println(sub);
		 System.out.print("["+nm.get(0)+" " +sub.get(0)+"]\n");
		 System.out.print("["+nm.get(1)+" " +sub.get(1)+"]\n");
		 System.out.print("["+nm.get(2)+" " +sub.get(2)+"]\n");
		 System.out.print("["+nm.get(3)+" " +sub.get(3)+"]\n");
		 System.out.print("["+nm.get(4)+" " +sub.get(4)+"]\n");
	}

}
