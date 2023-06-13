package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Media;

public class Store extends Cart{
    public void available() {
        System.out.println("-----Items in store------");
        for (Media media: itemsOrdered){
            System.out.println(media.toString());
        }
    }
}
