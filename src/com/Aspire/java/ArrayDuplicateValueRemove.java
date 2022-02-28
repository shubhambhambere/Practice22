package com.Aspire.java;

import java.util.TreeSet;

public class ArrayDuplicateValueRemove
{
public static void main(String[] args) {
	
	int []a= {1,2,3,4,5,6,7,8,9,2,3};	
	
	TreeSet tr=new TreeSet();
	
	for(int value:a)
	{
		tr.add(value);
	}
	
	System.out.println(tr);
	
}
	
	
}
