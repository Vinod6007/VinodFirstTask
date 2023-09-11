package org.sample;

public class overridingClass2 extends PolymorphismMethodOverriding {
	@Override
	public void rbi() {
System.out.println("Fixed=15%");
	}
	public static void saving() {
System.out.println("Saving=20%");
}
	public static void main(String[] args) {
		overridingClass2 c2=new overridingClass2();
		c2.rbi();
		overridingClass2.saving();
	}

}
