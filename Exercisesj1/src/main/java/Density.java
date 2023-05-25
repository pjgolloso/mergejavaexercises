import java.util.Scanner;

public class Density {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);	    

	System.out.print("Compute the value of \n[1] Density  \n[2] Mass  \n[3] Volume \n\nInput : ");
	 char i =input.next().charAt(0);

	 
	 switch(i) {
	 case '1':
		 System.out.print("\n Enter the value of Mass : ");
	 		double Mass = input.nextDouble();

	 		System.out.print("\nEnter the value of Volume : ");
	 		double Volume = input.nextDouble();


	 		double Density = Mass / Volume ;
	 		
	 	
	 		System.out.print("\n" + Density + " is the value of Density" );
	 		
		 break;
	 case '2':
		 System.out.print("\nEnter the value of Density : ");
			double Den = input.nextDouble();

			System.out.print("\nEnter the value of Volume : ");
			double Vol = input.nextDouble();


			double mass = Den * Vol ;

			System.out.print("\n" + mass + " is the value of Mass" );
			break;
		 
	 case '3':
		 System.out.print("\nEnter the amount of Mass : ");
			double m = input.nextDouble();

			System.out.print("\nEnter the amount of Density : ");
			double d = input.nextDouble();


			double v = m / d ;

			System.out.print("\n" + v + " is the value of Volume");
		 
		 break;
		 default:
			 
			 System.out.println("Invalid input");
			 break;
		 		 
	 		} 
		}
}
