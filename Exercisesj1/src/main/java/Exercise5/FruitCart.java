package Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FruitProduct {
    private String name;
    private double price;
    private double discount;

    public FruitProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }
}

class CartItem {
    private FruitProduct product;
    private int quantity;

    public CartItem(FruitProduct product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public FruitProduct getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        double discountedPrice = product.getPrice() * (1 - product.getDiscount());
        return discountedPrice * quantity;
    }
}

public class FruitCart {
    public static void main(String[] args) {
        List<FruitProduct> fruitProducts = createFruitProducts();
        List<CartItem> cart = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continueOrdering = true;
        while (continueOrdering) {
            displayFruitProducts(fruitProducts);

            System.out.print("Enter the number of the fruit you want to order (0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                continueOrdering = false;
                break;
            }

            if (choice < 1 || choice > fruitProducts.size()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            FruitProduct selectedProduct = fruitProducts.get(choice - 1);

            System.out.print("Enter the quantity for " + selectedProduct.getName() + ": ");
            int quantity = scanner.nextInt();

            CartItem cartItem = new CartItem(selectedProduct, quantity);
            cart.add(cartItem);

            System.out.println("Added to cart.");

            System.out.print("Do you want to order more fruits? (y/n): ");
            String orderMore = scanner.next();
            continueOrdering = orderMore.equalsIgnoreCase("y") || orderMore.equalsIgnoreCase("yes");
        }

        displayCartItems(cart);
        double total = calculateTotal(cart);
        System.out.println("Total: P" + total);
    }

    private static List<FruitProduct> createFruitProducts() {
        List<FruitProduct> products = new ArrayList<>();
        products.add(new FruitProduct("Apple        ", 45, 0.10));
        products.add(new FruitProduct("Banana       ", 30, 0.03));
        products.add(new FruitProduct("Orange       ", 25, 0.05));
        products.add(new FruitProduct("Mango        ", 40, 0.10));
        products.add(new FruitProduct("Grapes       ", 60, 0.02));
        products.add(new FruitProduct("Strawberries ", 80, 0.04));
        products.add(new FruitProduct("Pineapple    ", 75, 0.06));
        products.add(new FruitProduct("Watermelon   ", 99, 0.15));
        products.add(new FruitProduct("Kiwi         ", 30, 0.06));
        products.add(new FruitProduct("Pear        ",50, 0.00));
        return products;
    }

    private static void displayFruitProducts(List<FruitProduct> products) {
        System.out.println("Available Fruit Products:");
        for (int i = 0; i < products.size(); i++) {
            FruitProduct product = products.get(i);
            System.out.println((i + 1) + ". " + product.getName() + " - P" + product.getPrice() +
                    " (Discount: " + (product.getDiscount() * 100) + "%)");
        }
        System.out.println();
    }

    private static void displayCartItems(List<CartItem> cart) {
        System.out.println("Cart Items:");
        for (int i = 0; i < cart.size(); i++) {
            CartItem cartItem = cart.get(i);
            FruitProduct product = cartItem.getProduct();
            int quantity = cartItem.getQuantity();
            double itemTotal = cartItem.getItemTotal();

            System.out.println((i + 1) + ". " + product.getName() + " - P" + product.getPrice() +
                    " (Discount: " + (product.getDiscount() * 100) + "%) x " + quantity +
                    " = P" + itemTotal);
        }
        System.out.println();
    }

    private static double calculateTotal(List<CartItem> cart) {
        double total = 0;
        for (CartItem cartItem : cart) {
            total += cartItem.getItemTotal();
        }
        return total;
    }
}
