package Day1IQ;

public class SwapWithoutThirdVar{
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

// reversing of numbers by adding and subtracting 
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

