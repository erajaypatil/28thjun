package javaStudy;

public class StringStudy {
	
	public static void main(String[] args) {
		///String without using new keyword(constant pool area)
		String a2="Roakde24@";
		String a="Ajay";
		String a1="Ajay";
		//string using non constant pool area Sting using new keyowrd
		
		String s=new String("Velocity");
		String s1=new String("Velocity");
		String s2=new String("Vel");
		String s3=new String("Velocity123");
		
		System.out.println(a==a1);
		System.out.println(a.charAt(1));
		System.out.println(a.concat(s));
		System.out.println(a2.equals(a));
		System.out.println(a.lastIndexOf(s));
		System.out.println(a.length());
		System.out.println(a.startsWith(a1));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a2.length());
		
		
		String c="Ajay Rokade";
		String c1="";
		String[] d = c.split(c1);
		System.out.println(d[5]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
