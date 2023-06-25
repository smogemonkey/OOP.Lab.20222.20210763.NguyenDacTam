package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.exception.LimitException;

public class Cart {
	private ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();
	private static int MAX_NUMBER_ORDERED = 20;
	public void addMedia(Media d) throws LimitException{
		if (itemsOrdered.size() < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(d);
			System.out.println("The media has been added!");
		}
		else {
			throw new LimitException("ERROR: the number of medias exceeds cart's limit");
		}
	}
	public void addMedia(Media [] dList) throws LimitException{
//		for(int i=0; i< dvdList.length; i++) {
//			addDigitalVideoDisc(dvdList[i]);
//		}
		for (Media disc: dList) {
			addMedia(disc);}
	}
	public void addMedia(Media d1,Media d2) throws LimitException{
		addMedia(d1);
		addMedia(d2);
	}
	
	public void removeMedia (Media d) {
		try {
			itemsOrdered.remove(d);
			System.out.println("The media is removed!");
		}
		catch (Exception e) {
			System.out.println("Media has not been added yet!");
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
	public void print() {
		System.out.println("***********************CART***********************");
		for (int i = 0; i < this.itemsOrdered.size(); i++ ) {
			System.out.println(i+1 + ". " + itemsOrdered.get(i));
		}
		System.out.println("Total cost: " + totalCost() + "$");
		System.out.println("**************************************************");
	}
	public void searchId(int id) {
		for(Media item: itemsOrdered) {
			if(item.getId() == id) {
				System.out.println(item);
				return ;
			}
		}
		System.out.println("No media is matched!");
	}
	public void searchTitle(String title) {
		for(Media item: itemsOrdered) {
			if(item.getTitle().equals(title)) {
				System.out.println(item);
				return ;
			}
		}
		System.out.println("No media is matched!");
	}
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(ObservableList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
}
