package StringSample4;

public class Ex2 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is divya";
		String s4="abcabcabc";
		System.out.println(s1.length());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.replace("divya","didi"));
		System.out.println(s4.charAt(5));
		System.out.println(s3.endsWith("is"));
		System.out.println(s3.startsWith("name"));
		System.out.println(s4.indexOf('b'));
		System.out.println(s4.charAt(0));
		System.out.println(s1.contains(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		
	}

}
