package Stringsample;

public class S8 
{
	public static void main(String[] args)
	{
		String s1="new Sentence";
		String[] ar= s1.split(" ");
		System.out.println(ar.length);
		System.out.println(ar[0]);
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
