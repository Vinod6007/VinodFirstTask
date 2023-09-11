package org.sample;

import java.util.Scanner;

public class LastDigitNumber03 {
	public static int empId(int num){
		int rem=num%10;
		return rem;
		
	}

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the number= ");
int num = s.nextInt();
int lastDigit = LastDigitNumber03.empId(num);
System.out.println(lastDigit);
}
	}
