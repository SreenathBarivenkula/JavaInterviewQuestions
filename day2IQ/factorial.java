package day2IQ;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) {
	int i,f=1,n;
	System.out.println("enter the req factorial number ");
	
	Scanner sc= new Scanner(System.in);
	n = sc.nextInt();
	
	for(i=1;i<=n;i++) {
		f=f*i;
		
	}
	System.out.println("factorial=" + f);
	
	
	}
	
}
