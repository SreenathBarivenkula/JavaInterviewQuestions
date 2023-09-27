package day2IQ.Specialprogramms;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		int n,i=1,t,sum=0;
		System.out.println("Enter the number");
	Scanner sc =new Scanner(System.in);
	n=sc.nextInt();
	t=n;
	while(i<=n/2)
	{
		if(n%i==0)
		{
		 sum=sum+i;	
		}		i++;
	}
if(sum==t)
{
   System.out.println("the number is perfect");
}
else
{
   System.out.println("the number is not perfect");
}
}

}

