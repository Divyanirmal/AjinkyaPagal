package StringClass;

public class Sample1 
{
	public static void main(String[] args)
	{
		//Object creation String-->without using new keyword
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		//Object creation String--> using new keyword
		String  s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}

}
