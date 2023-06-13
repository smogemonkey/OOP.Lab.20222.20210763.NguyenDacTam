package hust.soict.dsai.aims.cart;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    public ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public float totalCost() {
        return (float) itemsOrdered.stream().mapToDouble(Media::getCost).sum();
    }

    public void addMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.add(media);
        }
    }

    public void removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) {
            itemsOrdered.remove(media);
        }
    }

    public Media searchByTitle(String title) {
        Media matchingMedia = itemsOrdered.stream()
                .filter(obj -> obj.getTitle().equals(title))
                .findFirst()
                .orElse(null);
        return matchingMedia == null ? null : matchingMedia;
    }

    public void sortTitle() {
        itemsOrdered.sort(Media.COMPARE_BY_TITLE_COST);
    }

    public void sortCost() {
        itemsOrdered.sort(Media.COMPARE_BY_COST_TITLE);
    }

    public void available() {
        System.out.println("-----Items in cart------");
        for (Media media: itemsOrdered){
            System.out.println(media.toString());
        }
    }
}
