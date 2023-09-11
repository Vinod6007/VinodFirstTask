package org.sample;

public class Constuctor {

	public static void main(String[] args) {
		Vinod v = new Vinod();
		v.chennai();
		Vinod v2=new Vinod(90,30);
	}
}

class Vinod {
	Vinod() {
		System.out.println("Default constructor");
	}

	Vinod(int i,int j){
		System.out.println("The division of "+(i/j));
		}


	public void chennai() {
		System.out.println("chennai");
	}
}