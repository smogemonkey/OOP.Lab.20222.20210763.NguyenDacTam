package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	private int nbItems = 0;
	public void addMedia(Media d) {
		itemsInStore.add(d);
		nbItems += 1;
		System.out.println("The media is added to store!");
	}
	public void removeMedia(Media d) {
		try {
			itemsInStore.remove(d);
			nbItems -= 1;
			System.out.println("The media is removed from store!");
		}
		catch (Exception e) {
			System.out.println("Media doesn't exist!");
			return ;
		}
	}
	public void print() {
		int num = 1;
		System.out.println("***********************STORE***********************");
		for(Media media: this.itemsInStore) {
			if (media instanceof DigitalVideoDisc) {
				DigitalVideoDisc dvd = (DigitalVideoDisc) media;
				System.out.println(num + ". " + dvd);
			}
			else if (media instanceof CompactDisc) {
				CompactDisc cd = (CompactDisc) media;
				System.out.println(num + ". " + cd);
			}
			else if (media instanceof Book) {
				Book book = (Book) media;
				System.out.println(num + ". " + book);
			}
			num++;
		}
		System.out.println("***************************************************");
	}
	public int getNbItems() {
		return nbItems;
	}
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
}
