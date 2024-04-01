package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository
public class BreakfastRepository {
    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");
        breakfastMenu.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));

        Iterator<MenuComponent> iterator = breakfastMenu.createIterator();
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
