package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.Media;

import hust.soict.dsai.aims.store.Store;

public class Aims {
	private static Cart cart = new Cart();
	private static Store store = new Store();

	public static void showMenu() {
		System.out.println("------AIMS-------: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");

	}

	public static void storeMenu() {
		System.out.println("------Store Menu-------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("------Media detail------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("-------Cart detail------");
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void selectInMenu() {

		Aims.showMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch (selection) {
			case 0: { //exit
				break;
			}
			case 1: // display all the items in the store and goto storeMenu
			{
				store.available();
				selectInStoreMenu();
				break;
			}
			case 2: // allow the user to add a media to or remove a media from the store
			{
				System.out.println("Add(a) or Remove(r) item in Store?");
				String select = System.console().readLine();

				if (select.compareTo("r") == 0) {
					System.out.println("Enter title of media");
					String title = System.console().readLine();
					Media x = store.searchByTitle(title);
					store.removeMedia(x);
				} else if (select.compareTo("a") == 0) {
					System.out.println("Enter type of media:");
					String type = System.console().readLine();
					if (type.equals("CD")) {
						System.out.println("Enter title of CD:");
						String title = System.console().readLine();
						Media x = new CompactDisc(title);
						store.addMedia(x);
					} else if (type.equals("DVD")) {
						System.out.println("Enter title of DVD: ");
						String title = System.console().readLine();
						Media x = new DigitalVideoDisc(title);
						store.addMedia(x);
					} else {
						System.out.println("Enter title of Book:");
						String title = System.console().readLine();
						Book x = new Book(title);
						store.addMedia(x);
					}
				}
				selectInMenu();
				break;

			}
			case 3: // information of the current cart and go to cartMenu
			{
				cart.available();
				selectInCartMenu();
				break;
			}
			default: {
				System.out.println("The selection is invalid!");
				selectInMenu();
				break;
			}
		}

	}

	public static void selectInStoreMenu() {

		Aims.storeMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch (selection) {
			case 0:
				selectInMenu();
				break; // Back
			case 1: // See a media's details
			{
				System.out.println("Enter title: ");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x != null) {
					System.out.println(x.toString());
					selectInMediaDetailsMenu(x);
				} else {
					System.out.println("not found, please re-enter!");
					selectInStoreMenu();
				}
				break;
			}
			case 2: // Add a media into the cart
			{
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x == null)
					System.out.println("sorry, the media is not in the store.");
				else {
					cart.addMedia(x);
					store.removeMedia(x);
				}
				selectInStoreMenu();
				break;
			}
			case 3: // Play a media
			{
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x != null) {
					if (x instanceof DigitalVideoDisc) {
						DigitalVideoDisc x_dvd = (DigitalVideoDisc) x;
						x_dvd.play();
					} else if (x instanceof CompactDisc) {
						CompactDisc x_cd = (CompactDisc) x;
						x_cd.play();
					} else
						System.out.println("Book cannot play!");
				} else {
					System.out.println("Your media is not on the store");
				}
				selectInStoreMenu();
				break;
			}
			case 4: {// see current cart
				cart.available();
				selectInStoreMenu();
			}
			default: {
				System.out.println("The selection is invalid!");
				selectInStoreMenu();
			}
		}

	}

	public static void selectInMediaDetailsMenu(Media x) {
		Aims.mediaDetailsMenu();
		int selection = Integer.valueOf(System.console().readLine());
		switch (selection) {
			case 0:
				Aims.selectInStoreMenu();
				break; // back
			case 1: // add to cart
			{
				cart.addMedia(x);
			}
			case 2: // play
			{
				x.play();
				selectInStoreMenu();
				break;
			}
			default: {
				System.out.println("The selection is invalid!");
				selectInMediaDetailsMenu(x);
				break;
			}
		}
	}

	public static void selectInCartMenu() {
		int select;

		Aims.cartMenu();
		select = Integer.valueOf(System.console().readLine());
		switch (select) {
			case 0: { // back
				selectInMenu();
				break;
			}
			case 1: {
				System.out.println("");
			}
			case 2: { // sort
				System.out.println("Enter choice: cost or title ?:");
				String choice = System.console().readLine();
				if (choice == "cost") {
					cart.sortCost();
				} else if (choice == "title") {
					cart.sortTitle();
				}
				break;
			}
			case 3: { // remove
				System.out.println("Enter title of Media: ");
				String media = System.console().readLine();
				Media x = cart.searchByTitle(media);
				if (x != null) {
					cart.removeMedia(x);
					store.addMedia(x);
					selectInMenu();
				} else {
					System.out.println("The media is not on the cart");
					selectInCartMenu();
				}

				break;
			}
			case 4: { // play
				System.out.println("Title of media:");
				String title = System.console().readLine();
				Media x = store.searchByTitle(title);
				if (x != null) {
					if (x instanceof DigitalVideoDisc) {
						DigitalVideoDisc x_dvd = (DigitalVideoDisc) x;
						x_dvd.play();
					} else if (x instanceof CompactDisc) {
						CompactDisc x_cd = (CompactDisc) x;
						x_cd.play();
					} else
						System.out.println("Book cannot play!");
				} else {
					System.out.println("Your media is not on the store");
				}
				break;
			}
			case 5: { // place order and empty current cart
				System.out.println("An order is created");
				cart = new Cart();
				break;
			}
			default: {
				System.out.println("Invalid!");
			}
		}
	}

	public static void main(String[] args) {
		selectInMenu();
	}
}