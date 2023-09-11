package org.sample;

public class Polymorphismmethodoverloadind {
	private void employee() {
System.out.println("Shimakh Technology");
	}
	public void employee(String name) {
System.out.println("Vinodhagan");
	}
	public static void employee(int id) {
System.out.println(007);
	}
	private static void employee(String name,int id) {
System.out.println("employee Details");
	}
public static void main(String[] args) {
	Polymorphismmethodoverloadind p=new Polymorphismmethodoverloadind();
	p.employee();
	Polymorphismmethodoverloadind.employee(6007);
	p.employee("vino");
	Polymorphismmethodoverloadind.employee("vino",6007);
}

}
