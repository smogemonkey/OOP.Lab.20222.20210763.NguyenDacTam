package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.screen.*;
public class StoreTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store = new Store();
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		store.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction", "George Lucas", 87, 24.95f);
		store.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		store.addMedia(dvd3);
		CompactDisc cd1 = new CompactDisc("Messi",
				"Animation");
		store.addMedia(cd1);
		CompactDisc cd2 = new CompactDisc("Ro",
				"Animation");
		store.addMedia(cd2);
		CompactDisc cd3 = new CompactDisc("Neymar",
				"Animation");
		store.addMedia(cd3);
		Book b1 = new Book("Mbappe");
		store.addMedia(b1);
		Book b2 = new Book("Haaland");
		store.addMedia(b2);
		Book b3 = new Book("Nkunku");
		store.addMedia(b3);
		StoreScreen storeScreen = new StoreScreen(store,cart);
	}
	
}
