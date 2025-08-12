import java.lang.*;
import java.util.*;

public class MaxFromTwo
{
	public static void main(String[] args)
	{
		int N1 = 0,N2 = 0;
		Scanner SC = new Scanner(System.in);
		
		System.out.print("\n Enter First Number : ");
		N1 = SC.nextInt();
		
		System.out.print("\n Enter Second Number : ");
		N2 = SC.nextInt();
		
		if(N1 == N2)
		{
			System.out.println("\n Both Numbers are Equal");
	    }
		 else if(N1 > N2)
		{
			System.out.println("\n Numbers " + N1 + " is Maximum.");
	    }
		else
		{
			System.out.println("\n Numbers " + N2 + " is Maximum.");
	    }
	}
	
}
			
		