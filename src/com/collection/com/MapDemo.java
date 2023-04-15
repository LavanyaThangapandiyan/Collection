package com.collection.com;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo 
{
	public static void main(String[] args) 
	{
		HashMap hs=new HashMap();
		hs.put(1000, "Aarthi");
		hs.put(1001, "Lavanya");
		hs.put(1002,"Shaji");
		hs.put(1003, "vaish");
		System.out.println(hs);
		Set s=hs.keySet();
		System.out.println(s);
		Collection s1=hs.values();
		System.out.println(s1);
		Set s2=hs.entrySet();
		System.out.println(s2);
		Iterator i=s2.iterator();
		while(i.hasNext())
		{
		System.out.println(i.next());	
		}
		System.out.println(hs.containsKey(1003));
		System.out.println(hs.containsValue("Shaji"));
		System.out.println(hs.isEmpty());
		System.out.println("get the value : "+hs.get(1002));
		hs.remove(1002);
		System.out.println("After removing :"+hs );
		hs.remove(1000, "aarthi");
		System.out.println(hs);
	}

}
