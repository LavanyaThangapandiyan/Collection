package com.collection.com;
import java.util.*;
import java.util.List;
public class Demo 
{	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(30);
		hs.add(120);
		hs.add(40);
		hs.add(50);
		System.out.println(hs);
		TreeSet ts=new TreeSet(hs);
		System.out.println("Used Treeset"+hs);
		LinkedList ls=new LinkedList(hs);
		Collections.sort(ls);
		System.out.println(ls);
		ls.add(4, "class");
		ls.set(3, 8.3);
		ls.set(2, 'R');
        Object[] ob=ls.toArray();
        for(Object o:ob)
        {
        	System.out.println(o);
        }

	}

}
