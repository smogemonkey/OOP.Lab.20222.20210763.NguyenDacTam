package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
	public int compare(Media m1, Media m2) {
		int c = m1.getTitle().compareTo(m2.getTitle());
        if (c != 0) return c;
        float diff = m1.getCost() - m2.getCost();
        if (diff < 0) return -1;
        else if (diff == 0f) return 0;
        return 1;
	}
}