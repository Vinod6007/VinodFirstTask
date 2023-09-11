package org.sample;

public class StringJava {

	public static void main(String[] args) {
         String s1="Indian Army";
         String s2="Save Indian people";
System.out.println(s1.length());  //To find out Length of String
System.out.println(s1.toUpperCase());// To covert all letter to capital

System.out.println(s2.toLowerCase());// To convert all letter to Small
System.out.println(s1.startsWith("India"));// To check starting sequence of String present or not?
System.out.println(s2.endsWith("Save"));// To check ending sequence of String present or not?
System.out.println(s2.contains("Indian"));// To check sequence of String present or not?
System.out.println(s2.substring(6,11));//To using  particular position of String here I have given begging String index position and ending String position
System.out.println(s1.charAt(3));//To check character by using index position
System.out.println(s1.indexOf("n"));//To check the character of first index position
System.out.println(s2.lastIndexOf("p"));//To check the character of last index position
System.out.println(s1.equals(s2));// To check String is equal or not? 
String s3="bangalore";
String s4="BANGALORE";
System.out.println(s4.equalsIgnoreCase(s3));// To check String is equal or not?This is accept the CASE
System.out.println(s3.equals(s4));// To check String is equal or not?This is not accept the CASE
String a="Welcome To All";
String rev="";
String rev1=" ";
String d = a.substring(0, 5);
int length = d.length();//6
System.out.println("Length is String is: "+length);
for(int i=length-1;i>=0;i--) {// 5 6 ..2 1 0 -1  index position start with 0 end with n-1
	rev=rev+d.charAt(i);}

String d1 = a.substring(7, 14);
int leng = d1.length();//8
for(int j=leng-1;j>=0;j--) {// 8 7  .. 0 -1  index position start with 0 end with n-1
	rev1=rev1+d1.charAt(j);
}

System.out.println("Reverse String is:"+rev.concat(rev1));
}
}	
