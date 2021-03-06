package DessertShop;

public class Cookie extends DessertItem {

	private double weight;
	private int price;
	
	public Cookie(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	@Override
	public int getCost() {
	
		return ((int) (weight * price));
	}

	public double getWeight() {
		return weight;
	}

	public int getPrice() {
		return price;
	}

}
