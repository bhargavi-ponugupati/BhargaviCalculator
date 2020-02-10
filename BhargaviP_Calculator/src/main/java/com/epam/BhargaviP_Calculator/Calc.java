package com.epam.BhargaviP_Calculator;
import java.util.Scanner;
public class Calc {
//Layer that user sees externally
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taking input using Scanner class
		Scanner s=new Scanner(System.in);
		int n1,n2;
		int k=1;
		char ch,c;
		Operations o=new Operations();
		while(k==1) {
			System.out.println("Enter first number:");
			n1=s.nextInt();
			System.out.println("Enter second number:");
			n2=s.nextInt();
			System.out.println("Choose the operation you want to perform:)");
			System.out.println("-->   +   <--\n-->   -   <--\n-->   *   <--\n-->   /   <--");
			ch=s.next().charAt(0);
			if(ch=='+') {
				o.add(n1, n2);
			}
			else if(ch=='-') {
				o.sub(n1, n2);
			}
			else if(ch=='*') {
				o.mult(n1, n2);
			}
			else if(ch=='/') {
				o.div(n1, n2);
			}
			else {
				System.out.println("Invalid operation");
			}
			System.out.println("Do you want to perform another operation(y/n)");
			c=s.next().charAt(0);
			if(c=='y') {
				k=1;
			}
			else {
				k=0;
			}
		}
	}

}
