package com.Aspire.java;

public class ArrayduplicateValueFind 
{

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,2,8,3,5};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Value Is="+a[i]);
					count++;
				}
				
			}
		
		}
		System.out.println("No of Duplicate Value Is="+count);
		
		
	}
	
}
