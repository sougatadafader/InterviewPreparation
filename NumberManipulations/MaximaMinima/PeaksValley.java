package Practice.MaximaMinima;

import java.util.ArrayList;
import java.util.List;

public class PeaksValley {
	
	//List<Integer> inputList = new ArrayList<Integer>();
	int[] array;
	
	
	public PeaksValley(int[] input)
	{
		this.array= input;
		peakFinder();
		valleyFinder();
	}
	
	 List<Integer> peakFinder()
	{
		List<Integer> maxList = new ArrayList<Integer>();
		int n = array.length;
		for(int i=1;i<n-1;i++)
		{
			if(array[i]>array[i-1] && array[i]>array[i+1])
			{
				maxList.add(array[i]);
			}
		}
		return maxList;
		
	}

	 List<Integer> valleyFinder()
	{
		List<Integer> minList = new ArrayList<Integer>();
		int n = array.length;
		for(int i=1;i<n-1;i++)
		{
			if(array[i]<array[i-1] && array[i]<array[i+1])
			{
				minList.add(array[i]);
			}
		}
		return minList;
	}
	static void printList(List<Integer> list)
	{
		for(int e:list)
		{
			System.out.print(e +" ");
		}
		
	}

	public static void main(String[] args) {
		//Array with unique integers
		int[] A= {14,2,3,5,6,4,7,1};
		PeaksValley p1 = new PeaksValley(A);
		List<Integer> l1 = p1.valleyFinder();
		List<Integer> l2 = p1.peakFinder();
		System.out.println("The list of valleys are: ");
		printList(l1);
		System.out.println("\nThe list of peaks are : ");
		printList(l2);
	}

}
