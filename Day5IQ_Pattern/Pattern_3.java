package Day5IQ_Pattern;

public class Pattern_3 {

	public static void main(String[] args) {

		 int n = 4; // You can change this value to adjust the number of rows
	        
	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n- i; j++) {
	                System.out.print(" ");
	            }
	            // Print asterisks
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }

	}

