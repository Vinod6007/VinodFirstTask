package org.sample;

public class TypeOfVariable {
	static int v = 07;// static variable

	public static void main(String[] args) {
		System.out.println(TypeOfVariable.v);//called static variable
		System.out.println(Car.a);//called static variable
		Car.state();//called static method
		System.out.println(Cycle.a1);//called static variable
		Cycle.country();//called static method
		System.out.println(Bike.a2);//called static variable
		Bike.purpose();//called static method
		
		Car c = new Car();// creating object
		c.home();//called non static method

		Cycle c3 = new Cycle();// creating object
		c3.house();//called non static method

		Bike b = new Bike();// creating object
		b.brand();//called non static method

	}
}

class Car {
	static int a = 02;// static variable
	String s1 = "Audi A4";// non static variable,instance variable

	public void home() {// non static method
		System.out.println("I'm in home");
		int z = 100;// local variable
		System.out.println(z);
		System.out.println(s1);
	}

	public static void state() {// static method
		System.out.println("Tamilnadu");
	}
}

class Cycle {
	static int a1 = 1994;// static variable
	String s2 = "BSA. 2.0";// non static variable

	public void house() {// non static method
		System.out.println("I'm in house");
		int y = 200;// local variable
		System.out.println(y);
		System.out.println(s2);
	}

	public static void country() {// static method
		System.out.println("India");
	}
}

class Bike {
	static int a2 = 6007;// static variable
	String s3 = "R15";// non static variable

	public void brand() {// non static method
		System.out.println("Yamaha");
		int x = 200;// local variable
		System.out.println(x);
		System.out.println(s3);
	}

	public static void purpose() {// static method
		System.out.println("Driving");
	}

}
