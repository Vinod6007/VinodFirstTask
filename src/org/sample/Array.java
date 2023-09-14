package org.sample;

public class Array {
	public static void main(String[] args) {
		int arr[]= {20,40,60,80,100,100,120,200};
		 arr[3]=50;
		 String s[]= {"vino","karthi","","raj"};
		System.out.println(arr.length);
		/*for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]= "+arr[i]);
		}*/
		for (int i : arr) {
			System.out.println("Print the Array values= "+i);
			
		}
		for (String b : s) {
			System.out.println(b);
			
		}
	int sum=0;// declare the value of sum in integer data type
	for(int i=0;i<arr.length;i++) // forloop
	{
sum=sum+arr[i];
	}
	System.out.println("sum="+sum);
	}

}
