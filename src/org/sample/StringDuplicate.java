package org.sample;

public class StringDuplicate {

	public static void main(String[] args) {
String s="Shimakh Technology";// I have declare the String variable 
System.out.println(s);
int len=s.length();//I have find the length it's store in integer variable
char[] c =s.toCharArray();
System.out.println("Duplicate characters are:");
for(int i=0;i<len;i++)
	for(int j=i+1;j<len;j++) {
		if(c[i]==c[j]) {
			System.out.println(c[i]);
		}
	}}

}
