
import java.util.ArrayList;

public class LoopClass
{
	public static void main(String[] args)
	{
		ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 0; i < Integer.MAX_VALUE; i++)
		{
			ar.add(i);
		}
	}
}
