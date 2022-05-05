package com.github_Practice;

public class Reverse {
	
	
	public static void main(String[] args) {
		  
		String s1="test engieers";
		String s="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			s=s+s1.charAt(i);
		}
		System.out.println("reverse of a string is:"+s);

	}

}
