package Stringsample;

public class S10 
{
	public static void main(String[] args)
	{
		String m1="my name is divya";
		String[] ar=m1.split(" ");
		System.out.println(ar.length);
		System.out.println(ar[1]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
