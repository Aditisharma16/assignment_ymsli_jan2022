package com.Day1Q2;
/*
 * 
 * Q2. Write a program called TimeTable to produce the multiplication table of 1 to 9 as shown using 
two nested for-loops:
 */

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int m= i*j;
				System.out.print(m+ " ");
			}
			System.out.println();
		}

	}

}
