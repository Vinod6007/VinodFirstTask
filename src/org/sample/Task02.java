package org.sample;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the month= ");
		int month = s.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("Output is= january");
			break;
		case 2:
			System.out.println("Output is= february");
			break;
		case 3:
			System.out.println("Output is= march");
			break;
		case 4:
			System.out.println("Output is= april");
			break;
		case 5:
			System.out.println("Output is= may");
			break;
		case 6:
			System.out.println("Output is= jun");
			break;
		case 7:
			System.out.println("Output is= july");
			break;
		case 8:
			System.out.println("Output is= augest");
			break;
		case 9:
			System.out.println("Output is= september");
			break;
		case 10:
			System.out.println("Output is= october");
			break;
		case 11:
			System.out.println("november");
			break;
		case 12:
			System.out.println("december");
			break;
		default:
			System.out.println("Invalid input ");
		}

	}

}
