package org.sample;

public class StarPattern {

	public static void main(String[] args) {
		String s[] = { "*", "**", "***", "****", "*****" };
		System.out.println("Array using Enhanced forloop to Print the *");
		for (String s2 : s) {
			System.out.println(s2);

		}
		System.out.println("Using forloop to Print *");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
