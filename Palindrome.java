public class Palindrome
{
	public static void main(String args[])
	{
		String string="uujojujuu";
		Integer j=string.length()-1,i=0;	
		while(i<j)
		{
			if(string.charAt(i)==string.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				break;
			}
		}
		if(i<j)
		System.out.println("Not a Palindrome");
		else
		System.out.println("Palindrome");
	}
}