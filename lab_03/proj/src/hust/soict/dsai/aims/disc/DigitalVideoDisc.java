package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(DigitalVideoDisc itself) {
		this(itself.getTitle(), itself.getCategory(), itself.getDirector(), itself.getLength(), itself.getCost());
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DigitalVideoDisc getItself() {
		return this;
	}
	public String toString() {
		return "DVD - " + "[" + this.title + "] - [" + director + "] - [" + length + "]: [" + cost + "]$";
	}
	public int getId() {
		return id;
	}
	public void setItself(DigitalVideoDisc itself) {
		this.title = itself.getTitle();
		this.category = itself.getCategory();
		this.director = itself.getDirector();
		this.length = itself.getLength();
		this.cost = itself.getCost();
		this.id = itself.getId();
	}
	public boolean isMatch(String title) {
		return this.getTitle().equals(title);
	}
}