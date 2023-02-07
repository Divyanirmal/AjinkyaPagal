package StringSample4;

public class Example
{
	public static void main(String[] args)
	{
		String s1="velocity";
		String s2="VELOCITY";
		String s3="my name is divya";
		String s4="abcabcabc";
		
		System.out.println(s1.length());//8
		System.out.println(s1.toUpperCase());//VELOCITY
		
		System.out.println(s2.toLowerCase());//velocity
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equalsIgnoreCase(s2));//true
		//compare only data
		System.out.println(s3.contains("is"));//true
		
		System.out.println("---------");

		System.out.println(s3.startsWith("my"));//true
		System.out.println(s3.endsWith("divya"));//true
		System.out.println(s1.charAt(4));//c
		System.out.println(s4.indexOf('b'));//1
		System.out.println(s3.replace("divya","nutika"));
		//my name is nutika
		
	}

}
