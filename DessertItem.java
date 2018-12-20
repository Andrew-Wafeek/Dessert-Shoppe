package DessertShop;

public abstract class DessertItem {
	
	protected String name;
	
	// Null constructor for DessertItem class
	public DessertItem() {
		
	}
	
	// Initializes DessertItem data
	public DessertItem(String name) {
	    if (name.length() <= DessertShoppe.MAX_ITEM_NAME_SIZE)
	      this.name = name;
	    else 
	      this.name = name.substring(0,DessertShoppe.MAX_ITEM_NAME_SIZE);
	    }
	
	
	public final String getName() {
		return name;
	}
	
	// Returns cost of DessertItem
	public abstract int getCost();
}