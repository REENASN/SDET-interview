package newSet;

public class PallindromeOrNot {

	public static void main(String[] args) {
		int number=1551,reverse=0,rem;
		int originalno=number;
		while(number>0)
		{
			rem=number%10;
			reverse=(reverse*10)+rem;
			number=number/10;
		}
		
		System.out.println("reverse is::"+reverse);
		if(originalno==reverse)
			System.out.println("pallindrome");
		else
			System.out.println("Not pallindrome");
	}

}
