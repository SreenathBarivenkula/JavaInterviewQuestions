package Day1IQ;

public class SwapWithThirdVar {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
