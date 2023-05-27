package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;

    public Store() {
        itemsInStore = new DigitalVideoDisc[0];
    }

    public void addDVD(DigitalVideoDisc dvd) {
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[itemsInStore.length + 1];
        for (int i = 0; i < itemsInStore.length; i++) {
            newItemsInStore[i] = itemsInStore[i];
        }
        newItemsInStore[itemsInStore.length] = dvd;
        itemsInStore = newItemsInStore;
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        DigitalVideoDisc[] newItemsInStore = new DigitalVideoDisc[itemsInStore.length - 1];
        int j = 0;
        for (int i = 0; i < itemsInStore.length; i++) {
            if (!itemsInStore[i].equals(dvd)) {
                newItemsInStore[j] = itemsInStore[i];
                j++;
            }
        }
        itemsInStore = newItemsInStore;
    }
}