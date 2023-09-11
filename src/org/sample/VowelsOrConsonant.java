package org.sample;

import java.util.Scanner;

public class VowelsOrConsonant {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter your name:");
char ch = s.next().charAt(0);

if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
	
	System.out.println("This is Vowels");
	
}else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
		
	System.out.println("This is consonant");
	

}else {
	System.out.println("Invalid");
}
	}

}
