package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.List;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position = position + 1;
        return menuItem;
    }

    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can't remove an item until you've done at least one next()");
        }
        if (items.get(position-1) != null) {
            for (int i = position-1; i < (items.size()-1); i++) {
                items.set(i, items.get(i+1));
            }
            items.set(items.size()-1, null);
        }
    }
}
