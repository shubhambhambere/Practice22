package com.Aspire.java;

public class PalendromeString 
{
	public static void main(String[] args) {
		
		String a="abba";   //
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
			
		}
		System.out.println(rev);
		if(a.equals(rev))
		{
			System.out.println("It it Palendrome String");
		}
		else
		{
			System.out.println("It is Not A Palendrome String");
		}
		
		
		
	}
}
