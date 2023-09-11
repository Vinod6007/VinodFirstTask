package org.sample;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Give the multiplication num= ");
int a = s.nextInt();
for(int i=1;i<=15;i++) {
	System.out.println(a+"*"+i+"="+(a*i));
}
	}

}
