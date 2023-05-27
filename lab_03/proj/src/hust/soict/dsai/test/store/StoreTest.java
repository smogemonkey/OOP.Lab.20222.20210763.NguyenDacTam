package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main (String[] args){
        DigitalVideoDisc dvd1 = new DigitalVideoDisc(20);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(35);
        Store store = new Store();
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        System.out.println(store.getQty());

        store.removeDVD(dvd2);
        System.out.println(store.getQty());

    }
}