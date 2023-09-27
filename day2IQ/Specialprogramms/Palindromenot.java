package day2IQ.Specialprogramms;

import java.util.Scanner;

public class Palindromenot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		int r;
		int sum=0;
		int t;
		Scanner sc=  new Scanner(System.in);
		System.out.println("enter the number :");
		n=sc.nextInt();
		t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum * 10 + r;
		}
		if(sum==t) {
			System.out.println("Num is palindrome"); 
	}else {
		System.out.println("Num is not palindrome"); 
	}
}
}


