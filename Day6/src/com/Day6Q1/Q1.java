package com.Day6Q1;

import java.util.*;

public class Q1 {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>(); 

	//add operation
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println(list);
	//size operation
		int size=list.size();
		System.out.println("size is: "+size);
		
		//iterator
		
		 ListIterator<Integer> numIterator = list.listIterator();

     // Traversing elements
     while (numIterator.hasNext()) {
         System.out.println(numIterator.next());
     }
	
	// add all operation
	List<Integer> list2 = new ArrayList<>();
	list2.addAll(list);
	System.out.println(list2);
	
	//remove operation
	list.remove(1);
	System.out.println(list);
	
	//remove all operation
	list2.removeAll(list);
	System.out.println(list2);
	
	
	//contains
	
	boolean ans = list.contains(2);
	  
    if (ans)
        System.out.println("The list contains 2");
    else
        System.out.println("The list does not contains 2");


	//list.clear();
}
}