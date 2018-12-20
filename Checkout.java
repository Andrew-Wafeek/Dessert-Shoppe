package DessertShop;

import java.util.ArrayList;

public class Checkout {
	
	private ArrayList<DessertItem> itemList;
	private DessertShoppe dessertShoppe;
	
	public Checkout() {
		itemList = new ArrayList<DessertItem>();
		dessertShoppe = new DessertShoppe();
	}
	
	public int numberOfItems() {
		return itemList.size();
	}
	
	public void enterItem(DessertItem item) {
		itemList.add(item);
	}
	
	public void clear() {
		itemList.clear();
	}
	
	public double totalCost() {
		double cost = 0;
		
		for(int i=0;i<itemList.size();i++) {
			cost += itemList.get(i).getCost();
		}
		
		return cost;
	}
	
	public double totalTax() {
		@SuppressWarnings("static-access")
		double tax = (totalCost() * dessertShoppe.TAX_RATE / 100);
		
		return tax;
	}
	
	// print receipt for the customer
	@SuppressWarnings("static-access")
	public StringBuilder receipt() {
		StringBuilder receipt = new StringBuilder();
		
		// print name of shop
		receipt.append("     "+dessertShoppe.STORE_NAME+"\n");
		receipt.append("     ");
		for(int i=0;i<dessertShoppe.STORE_NAME.length();i++) {
			receipt.append("-");
		}
		receipt.append("\n");
		
		// print the items
		for(int i=0;i<itemList.size();i++) {
			if(itemList.get(i).getName().length() <= dessertShoppe.MAX_ITEM_NAME_SIZE) {
				receipt.append(itemList.get(i).getName());
				for(int j=itemList.get(i).getName().length()+1;j<=32;j++) {
					receipt.append(" ");
				}
				receipt.append(dessertShoppe.cents2dollarsAndCents(itemList.get(i).getCost()));
				receipt.append("\n");
			}
		}
		receipt.append("\n");
		
		// print total tax
		receipt.append("Tax");
		for(int j="Tax".length()+1;j<=32;j++) {
			receipt.append(" ");
		}
		receipt.append(dessertShoppe.cents2dollarsAndCents((int) totalTax()));
		receipt.append("\n");
		
		// print total cost
		receipt.append("Total cost");
		for(int j="Total cost".length()+1;j<=32;j++) {
			receipt.append(" ");
		}
		receipt.append(dessertShoppe.cents2dollarsAndCents((int) totalCost()));
		
		return receipt;
	}

}
