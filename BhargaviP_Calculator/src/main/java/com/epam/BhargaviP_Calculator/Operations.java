package com.epam.BhargaviP_Calculator;

public class Operations extends Calc{
//main implementation is done here
	float f;
	public void add(int n1,int n2) {
		System.out.println("Sum="+(n1+n2));
	}
	public void sub(int n1,int n2) {
		System.out.println("Difference="+(n1-n2));
	}
	public void mult(int n1,int n2) {
		System.out.println("Product="+(n1*n2));
	}
	public void div(int n1,int n2) {
		try {
			f = n1/n2;
			System.out.println("Quotient="+f);
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide with zero"+e);
		}
	}
	
}
