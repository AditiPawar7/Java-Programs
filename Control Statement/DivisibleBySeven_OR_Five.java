import java.lang.*;
import java.util.*;

public class DivisibleBySeven_OR_Five{
      

	  public static void main(String[] args){
	  Scanner SC = new Scanner(System.in);
	  
	  
	  System.out.print("\n Enter The Number : ");
      int num = SC.nextInt();
	  
	  if( num == 0){
	  System.out.println("\n Error : Invalid Input  ");
	  }
      
	  else if(( num % 7 == 0 && num % 5 == 0)){
	  System.out.println("\n Given Number is only Divisible by both Five & Seven.  ");
	  }
	  else if (num % 7 == 0){
	  System.out.println("\n Given Number is  Divisible by Seven  ");
	  }
	  else if (num % 5 == 0){
	  System.out.println("\n Given Number is  Divisible by Five  ");
	  }
	   else {
	  System.out.println("\n Given Number is not Divisible by both Five & Seven.  ");
	  }
	  System.out.println("\n Thanks.");
	 }
	 
  }
	  