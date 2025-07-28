import java.lang.*;
import java.util.*;

public class Studentsmarks 
{
	public static void main(String[] args) 
	{
		
		int P = 0, C = 0, M = 0,Total = 0;
		float percentage;
		Scanner S = new Scanner(System.in);


                System.out.print("\n Enter first of physics marks  : ");
		P = S.nextInt();
		
		System.out.print("\n Enter Second of chemistry marks : ");
		C = S.nextInt();
		
		System.out.print("\n Enter Third of Maths marks : ");
		M = S.nextInt();
		
	        Total = P + C + M;
		percentage = (float) Total / 3;

		
		System.out.println("\n Total marks " + P + " & " + C + " & " + M + " is = " + Total + ".");
		System.out.println("\n Percentage = " + percentage + "%");

		System.out.println("\n Thanks.");
		
	}
}
