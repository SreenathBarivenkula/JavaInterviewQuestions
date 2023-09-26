package Day1IQ;

public class AddWithoutplus {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;        
            b = carry << 1;   
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int sum = add(num1, num2);

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
