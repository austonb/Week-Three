package chapter4;
import java.util.Scanner;
public class Exercise4_2 {
	 private static Scanner in;

	public static void main (String[] args){
	        in = new Scanner(System.in);

	        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
	        double point_1_latitude = in.nextDouble();
	        double point_1_longitude = in.nextDouble();
	        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
	        double point_2_latitude = in.nextDouble();
	        double point_2_longitude = in.nextDouble();

	        double d = 6371.01 * Math.acos((
	            Math.sin(Math.toRadians(point_1_latitude)) *
	            Math.sin(Math.toRadians(point_1_longitude))) +
	            (Math.cos(Math.toRadians(point_1_latitude)) * 
	            Math.cos(Math.toRadians(point_1_longitude)) * 
	            Math.cos(Math.toRadians(point_2_longitude) - Math.toRadians(point_2_latitude))));
	    
	        System.out.printf("The distance between the two points is %f km.%n", d);    
	}
}
