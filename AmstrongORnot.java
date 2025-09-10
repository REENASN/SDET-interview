package newSet;

public class AmstrongORnot {

	public static void main(String[] args) {
		int number=153,remainder,result=0;
		int originalnumber=number;
		while(number>0)
		{
			remainder=number%10;
			result+=remainder*remainder*remainder;
			number=number/10;
		}
		if(originalnumber==result)
		{
			System.out.println("Amstrong");
		}
		else
			System.out.println("Not Amstrong");
	}

}
