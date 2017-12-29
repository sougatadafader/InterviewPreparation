//Time Complexity of this Sorting technique is O(n^2)
//because there are two loops iterating over the array.
public class InsertionSort {
	
	public int[] inerstionSort(int[] arr)
	{
		
		int i,j,key,temp;
		i=1;
		while(i<arr.length) {
			key=arr[i];
			j=i-1;
			while(j>=0 && key<arr[j])
			{
				//Swap items here.
				temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
			i++;
		}
		return arr;
	}
	public static void main(String[] args)
	{
		
		int[ ] a= {5,8,1,3,2,4};
		InsertionSort  i = new InsertionSort();
		a= i.inerstionSort(a);
		//foreach loop used
		for(int n: a)
		{
			System.out.println(n);
		}
		
	}

}
