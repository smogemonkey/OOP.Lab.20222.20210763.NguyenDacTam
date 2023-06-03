package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// create a store
		Store store1 = new Store();
		
		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store1.addDVD(dvd1);
		
		// removeDVD1
		store1.removeDVD(dvd1);
	}

}