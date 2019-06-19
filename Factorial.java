public class Factorial
{
	public static Long factorial(int n)
	{
		if(n==0)
			return Long.parseLong("1");
		else
			return n*factorial(n-1);

	}
	public static void main(String args[])
	{
		System.out.println(factorial(5));	
	}
}