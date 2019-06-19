public class Largest
{
	public static void main(String args[])
	{
		Integer[] array={10,3,5,11,5};
		Integer i=1,max=array[0];	
		while(i<array.length)
		{
			if(max<array[i]	)
			{
				max=array[i];
			}	
		i++;
		}
		System.out.println(max);
		
	}
}