package Stringsample;

public class S13 
{
	public static void main(String[] args) 
	{
		String s1="my new phone";
		String[] ar=s1.split("");
		System.out.println(ar.length);
		System.out.println(ar[3]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
