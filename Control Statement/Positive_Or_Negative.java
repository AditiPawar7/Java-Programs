import java.lang.*;
import java.util.*;

public class Positive_Or_Negative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter The Number : ");
		int num = sc.nextInt();

		int Num = 0;
		if (num > 0) {
			System.out.println("The Number is Positive ");
		} else if (num < 0) {
			System.out.println("The Number is Negative");
		}
		System.out.println("Thanks");
	}

}