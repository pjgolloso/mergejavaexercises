import java.util.*;


public class exerhypotenuse {

	public static void main(String[] args)
	{
		System.out.println("Choose 1 if Pythagorean 2 is Area of Triangle: ");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		
		if (x.contains("1")) {
			Scanner input = new Scanner(System.in);
			double side1, side2, pytha;
			System.out.print("Enter a value for side 1: ");
			side1 = input.nextDouble();
			System.out.print("Enter a value for side 2: ");
			side2 = input.nextDouble();	
			pytha = pythagorean(side1,side2);
			System.out.print("The length of the hypothenuse is:  " + pytha);

			}
	
		else if(x.contains("2")) {
			Scanner input = new Scanner(System.in);
			double base, height, triangle;
			System.out.print("Enter a value for base: ");
			base = input.nextDouble();
			System.out.print("Enter a value for height: ");
			height = input.nextDouble();	
			triangle = 0.5 * base * height;
			System.out.print("The area of triangle is:  " + triangle);
			}
	
		else {
			System.out.print("Invalid input");
		}
	
	}
	static double pythagorean(double s1, double s2)
	{
					return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
	}
}