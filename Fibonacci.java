public class Fibonacci
{

	public static void fibonacci(int a,int b,int count)
	{
		if(count == 0) return;
		else
		{
			System.out.println(a+b);
			fibonacci(b,a+b,count-1);
		}
	}
	public static void main(String args[])
	{
		fibonacci(0,1,10);
	}
}