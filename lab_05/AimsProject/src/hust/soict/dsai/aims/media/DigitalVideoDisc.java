package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.DataConstraintsException;

public class DigitalVideoDisc extends Disc implements Playable {
	
	public DigitalVideoDisc(String title, String category, String director, int length, float cost){
		super(title, category, director, length, cost);
	}
	
	public DigitalVideoDisc(String title){
		super(title);
	}
	
	public DigitalVideoDisc(String title, String category, float cost) throws DataConstraintsException{
		this(title);
		this.setCategory(category);
		this.setCost(cost);
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
//	public boolean isMatch(String title) {
//		return this.getTitle().equals(title);
//	}
	
	@Override 
	public String toString(){
		return ("DVD - " + this.getTitle() 
				+ " - " + this.getCategory()
				+ " - " + this.getDirector()
				+ " - " + this.getLength()
				+ ": " + this.getCost() + "$");
	}
	
}