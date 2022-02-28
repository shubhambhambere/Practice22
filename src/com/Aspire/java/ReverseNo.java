package com.Aspire.java;
//12345------>54321

public class ReverseNo 
{
public static void main(String[] args)
{
	int num=12345;            //54321
    int rem=0;                //num%10---->5
	int rev=0;               //                 
    while(num>0)
    {
    	rem=num%10;          //5,4,3,2,1
    	rev=rev*10+rem;      //5,54 ,543,5432,54321
    	num=num/10;          //1234 ,123,12,1
    	
    }
    
    System.out.println("Reverse no="+rev);
	
	
}
}
