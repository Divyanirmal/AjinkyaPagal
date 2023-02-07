package StringSample4;

public class Example4 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="abcdef";
		String s4="my name is divya";
		
		System.out.println(s1.charAt(3));
		System.out.println(s2.contains(s1));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s3.charAt(4));
		System.out.println(s4.endsWith("divya"));
		System.out.println(s4.startsWith("my"));
		System.out.println(s4.replace("my","your"));
		System.out.println(s2.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s4.indexOf("is"));
		
	}

}
