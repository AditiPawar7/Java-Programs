import java.lang.*;
import java.util.*;

public class Areacircle {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float radius,area;
		
		System.out.print("\n Enter radius of circle :");
		radius = s.nextFloat();
		
		area = 3.14f * radius* radius;
		
		System.out.println("\n Area of circle = " + area);
	}
}
		
		