package day2IQ;

import java.util.Scanner;

public class numberIsprimeornot {
	public static void main(String[] args) {
	
	int n,i;
	
	boolean go=false;
	System.out.println("enter the number:");
	
	
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	
	 if (isPrime(n)) {
         System.out.println(n + " is a prime number.");
     } else if (n < 2) {
         System.out.println(n + " is neither prime nor composite.");
     } else {
         System.out.println(n + " is a composite/not a prime number.");
     }
 }

 public static boolean isPrime(int num) {
     if (num <= 1) {
         return false;
     }
     for (int i = 2; i <= num / 2; i++) {
         if (num % i == 0) {
             return false;
         }
     }
     return true;
 }
}

