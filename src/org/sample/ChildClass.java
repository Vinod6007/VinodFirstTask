package org.sample;

public class ChildClass extends Class2 {
	private void indianBank() {
System.out.println("7.1% intrest");
	}
	private void axisBank() {
System.out.println("6.8% intrest");
	}
	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.axisBank();
		c.indianBank();
		c.rbi();
		Class2.saving();
		MultilevelInheritance.sbi();
		c.hdfcBank();
		
	}
	

}
