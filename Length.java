public class Length
{
	public static void main(String args[])
	{
		String str="ii";
		Integer count=0;
		try
		{
			for(;;)
			{
				str.charAt(count);
				count++;
			}
		}
		catch(Exception exception)
		{
			System.out.println(count);	
		}
}	}