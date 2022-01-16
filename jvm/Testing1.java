package jvm;

import java.util.Scanner;
public class Testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		
		System.out.println("Enter a number");
		b=sc.nextInt();
		c=a*b;
		System.out.println("Product of the both numbers is="+c);
		}
		catch(Exception e) {}
		
		
	}
}