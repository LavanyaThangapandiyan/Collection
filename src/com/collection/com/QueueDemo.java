package com.collection.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{
	public static void main(String[] args) 
	{
	Queue q=new LinkedList();
	q.add(100);
	q.add(200);
	q.add(300);
	q.add(50);
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
	PriorityQueue<String> queue=new PriorityQueue<String>();
	queue.add("Raghul");
	queue.add("Ravi");
	queue.add("Naghul");
	queue.add("Naresh");
	System.out.println(queue);
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("iterating the queue elements:");  
	Iterator i=queue.iterator();  
	while(i.hasNext())
	{  
	System.out.println(i.next());  
	}
	queue.remove();  
	queue.poll();  
	System.out.println("after removing two elements:");  
	Iterator it=queue.iterator();  
	while(it.hasNext())
	{  
	System.out.println(it.next());  
	}  
	}

}
