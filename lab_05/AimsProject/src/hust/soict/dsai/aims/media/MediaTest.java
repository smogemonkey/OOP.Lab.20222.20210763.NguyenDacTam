package hust.soict.dsai.aims.media;
import java.util.List;
import java.util.ArrayList;

public class MediaTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		CompactDisc cd = new CompactDisc("Messi","Messi");
		DigitalVideoDisc dvd = new DigitalVideoDisc("Ronaldo","Cristiano","Rodrygo",7,8.52f);
		Book book = new Book("Neymar");
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		
		for(Media m: mediae) {
			System.out.println(m.toString());
		}
	}

}
