package day2IQ.Specialprogramms;

import java.util.Scanner;

public class SumofSquarenum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int r;
		int sum=0;
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter the number :");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r;
		}
		System.out.println("Sum of the digits of given num ="+ sum);
	}
}
