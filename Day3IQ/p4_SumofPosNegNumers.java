package Day3IQ;

public class p4_SumofPosNegNumers {
public static void main(String[] args) {
		
		int a[]= {2,-4,3,-9,5,-1};
		
		int i, p=0, n=0;
		
		System.out.println("positive elements are : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]);
				p=p+a[i];
			}
		}
		
		System.out.println("negative elements are : ");
		for(i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]);
				n=n+a[i];
			}
		}
		
		System.out.println("sum of positive elements are : "+p);
		System.out.println("sum of negative elements are : "+n);

	}

}
