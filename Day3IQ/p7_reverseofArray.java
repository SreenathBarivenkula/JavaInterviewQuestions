package Day3IQ;

public class p7_reverseofArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int i,k;
		
		System.out.println("Before Reversing :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("After Reversing :");
		for(i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	
	}

}
