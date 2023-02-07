package Stringsample;

public class S9 
{
	public static void main(String[] args)
	{
		String s1="waw this is so beautiful";
		String[] ar=s1.split(" ");
		System.out.println(ar[1]);
		System.out.println(ar.length);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
