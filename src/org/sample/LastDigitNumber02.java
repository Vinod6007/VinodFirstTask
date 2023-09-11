package org.sample;

public class LastDigitNumber02 {
public int	empId(int num) {
	int rem=num%10;
	return rem;
	
}

	public static void main(String[] args) {
		LastDigitNumber02 l=new LastDigitNumber02();
		int r = l.empId(1234567);
		System.out.println(r);
		
	}

}
