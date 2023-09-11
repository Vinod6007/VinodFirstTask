package org.sample;

public class ReverseOfnumber {

	public static void main(String[] args) {
		int num = 904313966;// declare the value of a in integer data type
		int rev = 0;

		while (num != 0) {// While loop check the condition
			int remainder = num % 10;// 904313966%10 6 90431396%10 6
			rev = rev * 10 + remainder;// 0*10+6 6 6*10+6 66
			num = num / 10;// 904313966/10 90431396 90431396/10 9043139
		}
		
		System.out.println(rev);
	}

}
