package DessertShop;

public class Sundae extends IceCream {

	private String topName;
	private int topPrice;
	
	
	public Sundae(String name, int price, String topName, int topPrice) {
		super(name, price);
		this.topName = topName;
		this.topPrice = topPrice;
	}
	
	public int getCost() {
		
		return (price+topPrice);
	}

	public String getTopName() {
		return topName;
	}

	public int getTopPrice() {
		return topPrice;
	}

}
