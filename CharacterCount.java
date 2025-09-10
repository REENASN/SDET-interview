package newSet;

public class CharacterCount {
	public static void main(String args[])
	{
		String str="This is not";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println("count is:"+count);
	}

}
