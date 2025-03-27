package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//accept coordinates from point 1
		System.out.println("Enter x and y coordinate for point 1: ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		Point2D p1 = new Point2D(x1, y1); 
		 
		//accept coordinates for point point 2
		System.out.println("Enter x and y coordintaes for point 2:");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x1, y1); 
		
		//display details
		System.out.println("Point 1: "+p1.getDetails());
		System.out.println("Point 2: "+ p2.getDetails());
		
		//check points are equal
		if(p1.isEqual(p2))
		{
			System.out.println("The points are same");
		}
		else
		{
			System.out.println("The points are different.");
			double distance = p1.calculateDistance(p2);
			
			System.out.printf("Distance betweeen point 1 and point 2: %.2f%n", distance);
		}
		
	}

}
