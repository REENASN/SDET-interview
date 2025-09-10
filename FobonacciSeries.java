package newSet;

public class FobonacciSeries {

	
	 static void fib(int N)
	{
		
		int n1=0,n2=1,n3;
		System.out.println("Fib series::");
		for(int i=1;i<=N;i++)
		{
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;n2=n3;
		}
		
	}
	public static void main(String[] args) 
	{
		int N=5;
		fib(N);

	}

}
