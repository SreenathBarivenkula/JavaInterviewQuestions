package day2IQ;

public class Series1to100sumeven {
	public static void main(String[] args) {
	       
		int i ;
		int sum=0;
		// Loop from 1 to 100
        for (i = 1; i <= 100; i++) {
        	if(i%2 ==0) {
        		sum=sum+i;
            }
        	 
        	}
        System.out.println(sum);
		  
          
    }
}


