 package Day3IQ;

public class p8_AverageofelementsatEvenPos {

	    public static void main(String[] args) {
	        int[] arr= {22,66,66,88,110};

	        double sum = 0;
	        int count = 0;

	        for (int i = 1; i < arr.length; i += 2) {
	            sum += arr[i];
	            count++;
	        }

	        if (count > 0) {
	            double average = sum / count;
	            System.out.println("Average of elements at even positions: " + average);
	        } else {
	            System.out.println("No elements at even positions to calculate the average.");
	        }
	    }
	}
