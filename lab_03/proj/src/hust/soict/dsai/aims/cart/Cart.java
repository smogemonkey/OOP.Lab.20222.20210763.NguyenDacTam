package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20; 
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsOrdered[qtyOrdered++] = disc;
		System.out.println("The disc has been added");
	}
	// public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
	// 	for (int i = 0; i < dvdList.length; ++i) {
	// 		addDigitalVideoDisc(dvdList[i]);
	// 	}
	// }
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for (DigitalVideoDisc dvd : dvdList) {
			addDigitalVideoDisc(dvd);
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int removedIndex = -1;
		for (int i = 0; i < qtyOrdered; ++i) {
			if (itemsOrdered[i] == disc) {
				removedIndex = i;
			}
		}
		if (removedIndex == -1) {
			return;
		}
		System.out.println("The disc " + (removedIndex + 1) + " has been removed");
		for (int i = removedIndex; i < qtyOrdered; ++i) {
			itemsOrdered[i]= itemsOrdered[i + 1]; 
		}
	}
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; ++i) {
			System.out.println(i + 1  + ". " + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	public void searchById(int id) {
		for (int i = 0; i < qtyOrdered; ++i) {
			if (itemsOrdered[i].getId() == id) {
				System.out.println("Find a matched dvd " + itemsOrdered[i].toString());
				/// because of unique id
				return;
			}
		}
		System.out.println("Cannot find a matched dvd");
	}
	public void searchByTitle(String title) {
		boolean matched = false;
		for (int i = 0; i < qtyOrdered; ++i) {
			if (itemsOrdered[i].isMatch(title)) {
				System.out.println("Find a matched dvd " + itemsOrdered[i].toString());
				/// because of unique id
				matched = true;
			}
		}
		if (matched == false) {
			System.out.println("Cannot find a matched dvd");
		}	
	}
}

