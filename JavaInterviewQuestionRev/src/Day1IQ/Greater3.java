package Day1IQ;

import java.util.Scanner;
public class Greater3 
{  
public static void main(String[] args)   
{  
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first num: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the Second num: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third num: ");
        int num3 = sc.nextInt();


if(num1>num2 && num1>num3){
 System.out.print(num1 + "is greater");
}
 else if(num2>num1 && num2>num3){
       System.out.print(num1 + "is greater");
}
      else{
      System.out.print(num1 + "is greater");
}  
}
}
