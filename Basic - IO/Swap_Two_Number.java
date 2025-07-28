import java.lang.*;
import java.util.*;

public class Swap_Two_Number
{
public static void main(String[] args)
{
	  int No1 = 0, No2 = 0, Temp = 0;
          Scanner sc = new Scanner(System.in);
	
	  System.out.print("\n Enter 1st Number : ");
	  No1 = sc.nextInt();
	
	  System.out.print("\n Enter 2nd Number : ");
	  No2 = sc.nextInt();
	
          System.out.println("\n Before Swapping => " + "\t 1st Number = " + No1 + "\t 2nd Number = " + No2);
    

          Temp = No1;
          No1  = No2;
	  No2  = Temp;
	
	  System.out.println("\n After Swapping => " + "\t 1st Number = " + No1 + "\t 2nd Number = " + No2);
   
   }
}
	
