package newSet;

public class NoOfOccurenceOfSpeccificCharacter {

	public static void main(String[] args) {
		String str="Programming";
		char ch='m';
		int occurencecount=search(str,ch);
		System.out.println("occuraence Of character "+ch+" is::"+occurencecount);
	}
	static int search(String str,char ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
				count++;
		}
		return count;
	}

}
