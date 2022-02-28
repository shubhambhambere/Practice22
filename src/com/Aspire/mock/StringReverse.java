package com.Aspire.mock;

public class StringReverse 
{

	public static void main(String[] args) {
		
		String a="abba";     //------abba
	
		String temp="";
		
		for(int i=a.length()-1;i>=0;i--)
		{
		           temp=temp+a.charAt(i);
			
		}
		System.out.println(temp);
		if(a.equals(temp))
		{
		System.out.println("It it PAlendrome String");	
		}
	
		else
		{
			System.out.println("It is Not Palendrome");
		}
		
		
	}
	
}
