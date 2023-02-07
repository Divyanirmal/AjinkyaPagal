package Stringsample;

public class S4 
{
	public static void main(String[] args) 
	{
		String s2="Hello Word";
		String[] ar=s2.split(" ");
		System.out.println(ar.length);
		System.out.println(ar[0]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
