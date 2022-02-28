package com.Aspire.java;
//153---->1*1*1+5*5*5+3*3*3=153   This Is Nothing but ArmStrong Number
public class ArmStrongNO 
{
public static void main(String[] args) 
{
	
	int num=407;
	int sum=0;
	int rem=0;
	int Temp=num;
	while(num>0)
	{
		rem=num%10;     //153------>3,5,1
		sum=sum+rem*rem*rem;
		num=num/10;     //15,1
		
	}
	if(Temp==sum)
	{
		System.out.println(Temp+" This IS Armstrong No ");
	}
	else
	{
		System.out.println(Temp+" This Is Not Armstrong No ");
	}
	
}
}
