import java.lang.*;
import java.util.*;

public class Check_Vowel
{
	public static void main(String[] args)
	{
		char ch = '\0' ;
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n Enter a Letter ");
		ch = s.next().charAt(0);
		
		
		if(ch >= 'A' && ch <= 'Z') 
		{
			System.out.println("\n Given Letter "  + ch + " is UpperCase");
	    }
		 
		else if (ch >= 'a' && ch <= 'z') 
		{
			System.out.println("\n Given Letter "  + ch +  " is  LowerCase .");
	    }
		else if (ch >= '0' && ch <= '9') 
		{
			System.out.println("\n Given Letter "  + ch +  " is Digit .");
	    }
		else
		{
			System.out.println("\n Given Letter "  + ch +  " is Special Symbol .");
		}
		
	}
	
}