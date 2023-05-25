package Exercise4;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPizza();

	}

	private static void again() {
		// TODO Auto-generated method stub
		System.out.print("\nWould you like to order another? Y/N :");
		try (Scanner inputScanner = new Scanner(System.in)) {
			String input = inputScanner.nextLine();
			
			if (input.contains("Y") || input.contains("y")) {
				getPizza();
				} 
			else {
				System.out.println("Order Ended");
				System.exit(0);
			}
		}
	}

	private static void getPizza() {

		Hawaiian hawaiian = new Hawaiian();
		Pepperoni pepperoni = new Pepperoni();
		Buffalo buffalo = new Buffalo();
		Allmeat allmeat = new Allmeat();

		System.out.println("Select a Pizza to Order");
		System.out.println("[1] Hawaiian Pizza");
		System.out.println("[2] Pepperoni Pizza");
		System.out.println("[3] Buffalo Pizza");
		System.out.println("[4] AllMeat Pizza");
		System.out.println("");
		System.out.print("Select a Pizza number to order: ");
		System.out.println("");

		try (Scanner input = new Scanner(System.in)) {
			int pizza = input.nextInt();

			// Hawaiian
			hawaiian.setHawaiianName("Hawaiian Pizza");
			hawaiian.setHawaiianDescription("Description: " + "Classic Hawaiian Pizza combines pizza sauce,\ncheese, cooked ham and pineapple. It's salty, sweet and cheesy\n");
			hawaiian.setHawaiianPrice(14.99);
			hawaiian.setHawaiianIngredients("Ingredients: " + "Pizza Sauce, Cheese, Cooked Ham and Pineapple");
			hawaiian.setHawaiianDiscount("Discount: " + "5%");
			
			// Pepperoni
			pepperoni.setPepperoniName("Pepperoni Pizza");
			pepperoni.setPepperoniDescription("Description: " + "Pepperoni pizza is an American pizza variety \nwhich includes one of the country's most beloved toppings.\n");
			pepperoni.setPepperoniPrice(12.99);
			pepperoni.setPepperoniIngredients("Ingredients: " + "Pizza Sauce, Mozzarella Cheese and Pepperoni");
			pepperoni.setPepperoniDiscount("Discount: " + "5%");
			
			// all meat
			allmeat.setAllmeatName("All Meat Pizza");
			allmeat.setAllmeatDescription("Description: " + "Homemade thin crust pizza, topped off with two types \nof cheese, bacon, ham, pepperoni and hot sausage!\n");
			allmeat.setAllmeatPrice(16.99);
			allmeat.setAllmeatIngredients("Ingredients: " + "Italian Sausage, Bacon, Pepperoni, Pizza Sauce and Sliced Ham");
			allmeat.setAllmeatDiscount("Discount: " + "5%");
			
			// buffalo
			buffalo.setBuffaloName("Buffalo Pizza");
			buffalo.setBuffaloDescription("Description: " + "Characterized by a light, fluffy, almost focaccia-like crust,\na semisweet sauce, copious amounts of mozzarella cheese and exclusive use of cup-and-char pepperoni\n");
			buffalo.setBuffaloPrice(18.99);
			buffalo.setBuffaloIngredients("Ingredients: " + "Buffalo wings sauce, Cheddar cheese, Tomato Slices, Jalapeno, Banana Peppers.");
			buffalo.setBuffaloDiscount("Discount: " + "5%");

			switch (pizza) {

			case 1:
				System.out.println("===============================================");
				System.out.println(hawaiian.getHawaiianName());
				System.out.println(hawaiian.getHawaiianDescription());
				System.out.println(hawaiian.getHawaiianPrice());
				System.out.println(hawaiian.getHawaiianIngredients());
				System.out.println(hawaiian.getHawaiianDiscount());
				System.out.println("===============================================");
				again();
				break;
			case 2:
				System.out.println("===============================================");
				System.out.println(pepperoni.getPepperoniName());
				System.out.println(pepperoni.getPepperoniDescription());
				System.out.println(pepperoni.getPepperoniPrice());
				System.out.println(pepperoni.getPepperoniIngredients());
				System.out.println(pepperoni.getPepperoniDiscount());
				System.out.println("===============================================");
				again();
				break;
			case 3:
				System.out.println("===============================================");
				System.out.println(allmeat.getAllmeatName());
				System.out.println(allmeat.getAllmeatDescription());
				System.out.println(allmeat.getAllmeatPrice());
				System.out.println(allmeat.getAllmeatIngredients());
				System.out.println(allmeat.getAllmeatDiscount());
				System.out.println("===============================================");
				again();
				break;
			case 4:
				System.out.println("===============================================");
				System.out.println(buffalo.getBuffaloName());
				System.out.println(buffalo.getBuffaloDescription());
				System.out.println(buffalo.getBuffaloPrice());
				System.out.println(buffalo.getBuffaloIngredients());
				System.out.println(buffalo.getBuffaloDiscount());
				System.out.println("===============================================");
				again();
				
				break;

			default:
				System.out.println("Invalid Input");
				break;

			}
		}
	}

}
