package day2IQ;

import java.util.Scanner;

public class tableprinting {

	public static void main(String[] args) {
		int n,i,t;
		System.out.println("Enter the required table number ");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		for(i=1;i<=10;i++) {
			t=n*i;
			System.out.println(t);
		}
	}
}
