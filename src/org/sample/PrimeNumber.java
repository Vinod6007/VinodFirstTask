package org.sample;

public class PrimeNumber {
	public static void main(String[] args) {
		int i;//declare the i in integer data type
		int j;//declare the j in integer data type
		for (i = 1; i <=50; i++) { //outer forloop
			int count=0;//declare the count in integer data type
			for (j = 1; j <= i; j++) { // inner forloop
				if (i % j == 0) {//+1
					count++; //increase the count value after inner loop
				}

			}
			if (count==2) {// check the condition
				System.out.println(i);//print the i values
			}
		}

	}
}
