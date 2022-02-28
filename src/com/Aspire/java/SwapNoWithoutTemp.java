package com.Aspire.java;


public class SwapNoWithoutTemp 
{public static void main(String[] args) {
	
	int a=20;  //------>a=10
	int b=10;  //------>b=20
    a=a+b;    //a=----->20+10=30
	b=a-b;     //b=----->30-10=20
	a=a-b;      //a=----->30-20=10
	System.out.println("Value of a="+a);
	System.out.println("Value of b="+b);

	
}	
}
