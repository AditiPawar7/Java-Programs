import java.lang.*;
import java.util.*;

public class Divisible_By_Seven{
      

	  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.print("\n Enter The Number : ");
      int num = sc.nextInt();
	  
      int Num = 0;
	  if( num ==0){
	  System.out.println("\n Invalid Input \n (As Mathematically DIviding Zero By integer gives INFINITE Results)  ");
	  if( num % 7==0){
	  System.out.println("\n Given Number is Divisible by Seven : ");
	  }
	  else{
	  System.out.println("\n Given Number is not Divisible by Seven : ");
	  }
	  System.out.println("\n Thanks");
	 }
	 
  }
	  