package Exercise4;

public class Allmeat {
	
	private String Name;
	private String Description;
	private double Price;
	private String Ingredients;
	private String discount;
	
	public String getAllmeatName() {
		return Name;
	}
	public void setAllmeatName(String name) {
		Name = name;
	}
	public String getAllmeatDescription() {
		return Description;
	}
	public void setAllmeatDescription(String description) {
		Description = description;
	}
	public double getAllmeatPrice() {
		return Price;
	}
	public void setAllmeatPrice(double price) {
		Price = price;
	}
	public String getAllmeatIngredients() {
		return Ingredients;
	}
	public void setAllmeatIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	public String getAllmeatDiscount() {
		return discount;
	}
	public void setAllmeatDiscount(String discount) {
		this.discount = discount;
	}
	
}