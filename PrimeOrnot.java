package newSet;

import java.util.Scanner;

public class PrimeOrnot {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int flag=0;
		int N=number/2;
		for(int i=2;i<=N;i++)
		{
			if(number%i==0)
				flag=1;
				
		}
		if(flag==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
			

	}

}
