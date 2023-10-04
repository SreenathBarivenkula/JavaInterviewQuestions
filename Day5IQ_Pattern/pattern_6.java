package Day5IQ_Pattern;

public class pattern_6 {

	public static void main(String[] args) {
		  int numRows = 4; // You can change this value to adjust the number of rows
	        
	        for (int i = 1; i <= numRows; i++) {
	            // Print spaces
	            for (int j = 1; j < i; j++) {
	                System.out.print("  ");
	            }

	            // Print asterisks
	            for (int k = 1; k <= (2 * (numRows - i + 1) - 1); k++) {
	                System.out.print("* ");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	    }
		}


