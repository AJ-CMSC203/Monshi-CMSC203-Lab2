
import java.util.Scanner;

public class SphereCalculation {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		double diameter, radius; 
		//program tells function
		System.out.println("This program is meant to calculate the volume of a sphere");
		//prompt reader for diameter
		System.out.print("Input a diameter: ");
		diameter = user.nextDouble();
		radius = diameter/2;
		//display radius
		System.out.println("Radius =" + radius);

		//calculate volume
		//note: V = (4/3)(pi)(r^3)
		
		
		double PART1 = 4.0 / 3.0;
		
		double sphereVolume = PART1 * Math.PI * Math.pow(radius, 3);
		System.out.println("The volume of the sphere would be: " + sphereVolume);
	}

}
