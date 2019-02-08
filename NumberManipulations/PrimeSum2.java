package Practice;
import java.util.Scanner;

public class PrimeSum2 {
	
	static void findSumofPrimes(int n)
	{
		int count=0;
		int num=2;
		int sum=0;
		while(count !=n)
		{
			boolean prime = true;
			for(int i=2;i<=java.lang.Math.sqrt(num);i++)
			{
				if(num % i ==0)
				{
					prime = false;
					break;
				}
			}
			
			if(prime)
			{
				count++;
				sum+=num;
			}
			num++;
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = reader.nextInt();
		reader.close();
		findSumofPrimes(n);
				
	}

}
