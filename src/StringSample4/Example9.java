package StringSample4;

public class Example9
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is rahul";
		String s4="abcabcabc";
		String s5="";
		
		System.out.println(s5.isEmpty());//true
		System.out.println(s1.isEmpty());//false
		System.out.println(s1.concat(s2));//velocityVELOCITY
		System.out.println(s1+s2);
		System.out.println(s1.substring(3,6));
		System.out.println(s2.substring(1,8));
		System.out.println(s1.substring(4));
		System.out.println("-------");
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s3.contains("is"));
		System.out.println(s3.startsWith("my"));
		System.out.println(s3.endsWith("rahul"));
		System.out.println(s1.charAt(3));
		System.out.println(s4.indexOf(5));
		System.out.println(s4.lastIndexOf('a'));
		System.out.println(s3.replace("rahul", "ganesh"));
		System.out.println(s4.replace("abc", "xyz"));
		
		
		
	}

}
