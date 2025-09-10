package newSet;

public class Factorial {
	
	static int factorial(int N)
	{
		int fact=1;
		for(int i=1;i<=N;i++)
		{
			fact=fact*i;
			
		}
return fact;
	}
	
	public static void main(String[] args)
	{
		int N=4;
		System.out.println("factorial is:"+factorial(N));
		
	}
	
}
