import java.lang.*;
import java.util.*;

public class Vowel
{
	public static void main(String[] args)
	{
		char ch = '\0' ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n Enter a Letter ");
		ch = sc.next().charAt(0);
		
		
		if(ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U'|| ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u'  )
		{
			System.out.println("\n Given Letter "  + ch + " is Vowel");
	    }
		 
		else
		{
			System.out.println("\n Given Letter "  + ch +  " is Not Vowel .");
	    }
	}
	
}
			
		