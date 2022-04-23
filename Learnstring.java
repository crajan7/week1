package week1.day1;

public class Learnstring {
	
	public static void main(String[] args) 
	{
		String text="TestLeaf";
		int Count=0;
		int len=text.length();
		for( int i=0;i<len;i++)
		{
			text.charAt(i);
			if(text.charAt(i)=='e')
			{
				Count=Count+1;
			
			}
		}
System.out.println("No of letter is " +Count);
}
}
