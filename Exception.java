
class Exception
{
	public static void main (String[] args)
	{
		

		int[] arr = new int[5];
		
		try
		{
			int i = arr[5];

			System.out.println("Inside try the block");
		}
		
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception caught in the catch block");
		}
		
		finally
		{
			System.out.println("finally block is executed");
		}
		
		// rest program will be executed
		System.out.println("Outside try-catch-finally block");
	}
}
