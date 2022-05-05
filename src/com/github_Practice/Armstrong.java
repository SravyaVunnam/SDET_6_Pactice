package com.github_Practice;

public class Armstrong {
	
	public static void main(String[] args) {
		int num=153,rem,arm=0,cp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			arm=arm+rem*rem*rem;
		}
		System.out.println("arm :"+arm);
		if(cp==arm)
		{
			System.out.println("its a arm ");
		}
		else
		{
			System.out.println("its not a arm");
		}
	}

}
