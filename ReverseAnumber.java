package newSet;

public class ReverseAnumber {

	public static void main(String[] args) {
		int number=1567,reverse=0,rem;
		while(number>0)
		{
			rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		System.out.println("reverse is::"+reverse);
	}

}
