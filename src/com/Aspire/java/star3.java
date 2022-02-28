package com.Aspire.java;
//    *
//   * *
//  * * *
// * * * *
//* * * * *
//row=1-5
//space=4-0
//star=1-5

public class star3 
{
	public static void main(String[] args) 
	{
	
	for(int row=1;row<=5;row++)
	{
		for(int space=4;space>=row;space--)
		{
			System.out.print(" ");
			
		}
		for(int star=1;star<=row;star++)
		{
			System.out.print("* ");
		}
		
		System.out.println();
	}
		
		
		
}

}
