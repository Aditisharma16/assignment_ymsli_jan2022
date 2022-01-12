package com.Day1Q5;
/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8
 */

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<8;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
	}

}
