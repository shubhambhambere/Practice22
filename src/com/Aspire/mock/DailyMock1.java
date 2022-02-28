package com.Aspire.mock;

public class DailyMock1 
{
public static void main(String[] args) {
	//121------>121  ------->PALENDROME
	//125------->521  -------->Not PALENDROME
	int num=1234;
	int rev=0;
	int rem=0;
	int temp=num;
	while(num>0)
	{
		rem=num%10;     //1,2,1
		rev=rev*10+rem;  //1,12,121
		num=num/10;     //12,1
		
	}
	
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("Palendrome Number= "+rev);
	}
	else
	{
		System.out.println("It Not Palendrome="+rev);
	}
	
	
}
	
}
