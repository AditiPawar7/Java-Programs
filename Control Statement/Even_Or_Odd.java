import java.lang.*;
import java.util.*;

public class Even_Or_Odd{
      

	  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("Enter The Number : ");
      int num = sc.nextInt();
	  
      int Num = 0;
	   if( num == 0){
	  System.out.println("The Number is Neutral.");
	  }
	   else if( num % 2==0){
	  System.out.println("The Number is even");
	  }
	  else{
	  System.out.println("The Number is odd");
	  }
	  System.out.println("Thanks.");
	 }
	 
  }
	  
   
    