import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered = 
			new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 20) {
			System.out.println("The cart is full, "
					+ "please remove previous discs to add!");
			return ;
		}
		if(qtyOrdered > 15) {
			System.out.println("The cart is almost full!");
		}
		
		itemsOrdered.add(disc);
		qtyOrdered += 1;
		System.out.println("The disc has been added!");
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		try {
			itemsOrdered.remove(disc);
			qtyOrdered -= 1;
			System.out.println("The disc is removed!");
		}
		catch (Exception e) {
			System.out.println("Disc has not been added yet!");
			return ;
		}
	}
	public float totalCost() {
		float total = 0;
		for(int i= 0; i< itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
}