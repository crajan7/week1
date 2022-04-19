package week1.day1;

public class Primevalidation {
	public static void main(String[] args) 
	{
		int x=11;
		boolean test=false;
		for (int i=2;i<=x/2;i++)
{
	x=x%2;
	if(x==0)
	{
		test=true;
		
	}
	else
	{
		test=false;
		
	}
}
if (test==false)
{
	System.out.println("No is prime");
}
else
{
	System.out.println("no is non prime");
} 
	
}
}

