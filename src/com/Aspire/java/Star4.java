package com.Aspire.java;
//* * * * * 
// * * * *
//  * * *
//   * *
//    *
//row=1-5
//space=0-4
//star=5-1

public class Star4 {
public static void main(String[] args) {
	
	for(int row=1;row<=5;row++)
	{
		for(int space=2;space<=row;space++)
		{
			System.out.print(" ");
			
		}
		
		for(int star=5;star>=row;star--)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	
}
}
