import java.util.Scanner;

public class fibosequence {

	static void Fibosequence(int range)
	{
		int num1 = 1, num2 =2;
		int counter = 0 ;
		
		while(counter<range)
		{
			System.out.print(num1 +" ");
			
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter +1;
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter range: ");
		int range = scan.nextInt();
		
		Fibosequence(range);
	}
}