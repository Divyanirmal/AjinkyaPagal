package Stringsample;

public class S6 
{
	public static void main(String[] args) 
	{
		String s="Welcomr to my home";
		String[] ar=s.split(" ");
		System.out.println(ar[1]);
		System.out.println(ar.length);
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
	}

}
