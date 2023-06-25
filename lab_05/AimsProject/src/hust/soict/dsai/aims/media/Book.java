package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.dsai.aims.exception.DataConstraintsException;

public class Book extends Media {

	private List<String> authors = new ArrayList<String>();
	
	public Book() {
	}
	
	public Book(String title) {
		super(title);
	}
	
	public Book(String title, String category, float cost) throws DataConstraintsException {
		super(title,category,cost);
	}
	
	public Book(int id,String title, String category, float cost) {
		super(id,title,category,cost);
	}
	
	public void addAuthor(String authorName) {
		for(String author: authors) {
			if(author.equals(authorName)) {
				System.out.println("Author is already added!");
				return ;
			}
		}
		authors.add(authorName);
		System.out.println("Author is added!");
	}
	public void removeAuthor(String authorName) {
		for(String author: authors) {
			if(author.equals(authorName)) {
				authors.remove(authorName);
				System.out.println("Author is removed!");
				return ;
			}
		}
		System.out.println("Author is not added yet!");
	}
	public List<String> getAuthors() {
		return authors;
	}
	
	@Override
	public String toString() {
		return ("Book - " + this.getTitle() 
		+ " - " + this.getCategory()
		+ ": " + this.getCost() + "$");
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
}
