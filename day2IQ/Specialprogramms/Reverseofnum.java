package day2IQ.Specialprogramms;

import java.util.Scanner;

public class Reverseofnum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int r;
		int rev=0;
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter the number :");
		n=sc.nextInt();
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev = rev * 10 + r;
		}
		System.out.println(" the reverse of given num ="+ rev);
	}
}
