package com.Day1Q4;
/*
 * 
 * Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
array. The method's signature is as follows:
public static int[] copyOf(int[] array)
 */
public class Q4 {
	
	public static int[] copyOf(int[] array) {
		
		int b[]= new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			b[i]=array[i];
		}
		
		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= { 2,6,4,6};
		
		for(int temp:array)
		{
			System.out.print(temp + " ");
		}
		
		System.out.println();
		int copyArray[]= copyOf(array);
		
		for(int temp:copyArray)
		{
			System.out.print(temp + " ");
		}

	}

}
