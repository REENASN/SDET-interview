package newSet;

public class LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4,5,89,56,34,90};
		int x=90;
		int index= search(arr,x);
		if(index==-1)
			System.out.println("Not found in the array");
		else
			System.out.println("Found in the array");
		}
	
	static int search(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;		
		}
		return -1;
	}

}
