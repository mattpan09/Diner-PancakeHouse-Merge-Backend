package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository
public class LunchRepository {
    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent lunchMenu = new Menu("Lunch Menu", "Lunch");
        lunchMenu.add(new DinerMenu("DINER MENU", "Lunch"));

        Iterator<MenuComponent> iterator = lunchMenu.createIterator();
        List<MenuItemRecord> records = new java.util.ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            if (menuComponent instanceof MenuItem) {
                records.add(new MenuItemRecord(menuComponent.getName(),
                        menuComponent.getDescription(),
                        menuComponent.isVegetarian(),
                        menuComponent.getPrice()));

            }
        }
        return records;
    }
}
