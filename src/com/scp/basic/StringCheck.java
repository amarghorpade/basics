package com.scp.basic;

public class StringCheck
{
	public static void main(String[] args) 
	{
		String s1=new String("ab");
		String s2="cd";
		
		String s6=s2.intern();
		System.out.println("****");
		System.out.println(s2==s6);
		System.out.println("****");
	String s3=new String("sangli");
		String s5=s1;
		//s3.length()
	System.out.println(s1==s2);//false--- reference check
	System.out.println(s1.equals(s2));//true---- content check
	System.out.println(s1==s3);//false---In S3 new object created with same content of s1 then reference is different, duplication allow in Heap
	String s4="sangli";
	System.out.println(s2==s4);// true-- s2 and s4 are pointing to same reference coz duplication not allow in SCP
	System.out.println(s5==s1);// true--- assignment happened so same
	System.out.println(s5==s2);// false-- s5 with new operator AND s2 with " double quote. 
		//String s6= new String("SANGLI");
	System.out.println(s1.equals(s6));//false---s1 in lower case and s6 is in upper so case is checked and found different 
	System.out.println(s1.equalsIgnoreCase(s6));//true---s1 in lower case and s6 is in upper but this method ignores the case
		String s7="SANGLI";
	System.out.println(s2==s7);// false created new objecj in SCP with Cappital 'DURGA', and s1 is 'durga'
		String s8=s1.intern();
	System.out.println(s8==s1);// false
	System.out.println(s8==s2);//true
		

		String s20=s1.concat(s2);
		
		
		System.out.println(s20);
		
		String s10=s1+s2;
		String s23="abcd";
		String s24="abcd";
		System.out.println("suddgfiludgdo");
		System.out.println(s10==s23);
		System.out.println(s20==s23);
		System.out.println(s24==s23);
		
		//System.out.println(s10==s20);
		//String s15="pune";
		//String s16= "pune";
		
		//System.out.println(s15==s16);
		String s11="sanglisangli";
		
		//System.out.println("sff"+s20==s11);
		String s12="sanglisangli";
		//System.out.println(s11==s12);
		//System.out.println(s10==s11);		
	}
}