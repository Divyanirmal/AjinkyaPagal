package StringSample4;

public class Ex3 
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is divya";
		String s4="abcabc";
		
		
		System.out.println(s1.length());//8
		System.out.println(s4.length());//6
		System.out.println(s2.charAt(4));//C
		System.out.println(s1.toUpperCase());
		System.out.println(s2.contentEquals(s1));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.toLowerCase());
		System.out.println(s3.contains("is"));
		System.out.println(s4.indexOf('c'));
		System.out.println(s3.replace("my","your"));
		System.out.println(s4.charAt(5));
		System.out.println(s1.charAt(6));
		
	}

}
