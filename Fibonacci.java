package week1.day1;

public class Fibonacci
{
	public static void main(String[] args) 
	
			{
				int x=0;
				int y=1;
				int n=5;
				int k;
				for(int a=0;a<=n;++a)
				{
				System.out.println(x);
				k=x+y;
				x=y;
				y=k;
				}
			}	
}

