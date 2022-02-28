package com.Aspire.mock;

public class ArrayDuplicate
{
public static void main(String[] args)
{
	int []a= {1,2,3,4,5,2,3};
	int count=0;
	for(int i=0;i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("Duplicate Value ="+a[i]);
				count++;	
			}
			
			
		}
		
		
	}
	System.out.println("No of duplicates Present="+count);
		
	
	
}
}
