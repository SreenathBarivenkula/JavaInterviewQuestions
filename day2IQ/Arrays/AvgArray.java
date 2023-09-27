package day2IQ.Arrays;

public class AvgArray {
	public static void main(String[] args) {
		int a[]= {20,44,60,88,40};
		int i,sum=0,avg=0;
		for(i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements is :" +sum);
		
		avg=sum/5;
		System.out.println("avg of elements is :" +avg);
		
		
		

	}

}

