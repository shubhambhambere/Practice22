package com.Aspire.mock;

import java.util.TreeSet;

public class ArrayDuplicateNotallow 
{
public static void main(String[] args) 
{
	int []a= {1,2,4,5,6,3,2,3,1};
	
	TreeSet tr=new TreeSet();
	for(int b:a)
	{
		tr.add(b);
	}
	System.out.println(tr);
	
	
	
	
}
}
