package Practice;

//find sum of prime numbers between 1 and 1000.
public class PrimeSum {
	
	public static void main(String[] args)
	{
		int n=1000;
		int sum=0;
		int dummy=3;
		while(dummy<=n)
		{
			for(int i=2;i<=n;i++)
			{
				if(dummy%i !=0)
				{
					sum +=dummy;
				}
			}
			dummy+=1;
		}
		System.out.println(sum);
	}
}