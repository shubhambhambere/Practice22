package com.Aspire.java;

public class PalendromeNo 
{

	public static void main(String[] args) {
		
		int num=1551;
		int rem=0;
		int rev=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		
		System.out.println("Number is="+rev);
		if(rev==temp)
		{
			System.out.println("It Is Palendrome Number");
		}
		else
		{
			System.out.println("It Is Not Palendrome Number");
		}
		
		
		
	}
	
}
