package Day1IQ;

import java.util.Scanner;
public class Greater 
{  
public static void main(String[] args)   
{  
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second num: ");
        int num2 = sc.nextInt();


if(num1>num2)  
{  
System.out.println(num1 +"is greater than"+ num2);  
}  
else  
{  
System.out.println(num2 +"is greater than"+ num1);  
}  
}  
}
