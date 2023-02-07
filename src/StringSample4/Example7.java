package StringSample4;

public class Example7 
{
	public static void main(String[] args) 
	{
		String s1="abc";
		String s2="abcdef";
		String s3="my name is divya";
		String s4="xyz";
		System.out.println(s1.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(s1.charAt(0));
		System.out.println(s3.startsWith("is"));
		System.out.println(s3.endsWith("divya"));
		System.out.println(s3.contains("no"));
		
	}

}
