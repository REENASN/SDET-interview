package newSet;

public class NumberOfOccurenceoFCharacters {

	public static void main(String[] args) {
		String str="Saira Afzal";
		String completed=" ";
		for(int i=0;i<str.length();i++)
		{
			int count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
			}
			
			String s=String.valueOf(str.charAt(i));
			if(!completed.contains(s))
			{
				completed=completed+str.charAt(i);
				System.out.println("Total no of occurance of "+str.charAt(i)+" is "+count);
			}
		}

	}

}
