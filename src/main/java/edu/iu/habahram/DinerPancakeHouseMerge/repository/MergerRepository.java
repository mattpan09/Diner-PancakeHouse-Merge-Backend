package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class MergerRepository {
    public List<MenuItemRecord> getTheMenuItems() {
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(new DinerMenu("DINER MENU", "Lunch"));
        allMenus.add(new PancakeHouseMenu("PANCAKE HOUSE MENU", "Breakfast"));
        allMenus.add(new CafeMenu("CAFE MENU", "Dinner"));
//        allMenus.add(new DinerMenu());
//        allMenus.add(new PancakeHouseMenu());
//        allMenus.add(new CafeMenu());
//        MenuItem[] menuItems = allMenus.getItems();


//        Iterator<MenuComponent> iterator = allMenus.createIterator();
//
//        while (iterator.hasNext()) {
//            MenuComponent menuComponent = iterator.next();
//            System.out.println(menuComponent.getName());
//        }
//
//        return null;


        //Use iterator to add menu items to records




//        List<MenuItemRecord> records = Arrays.stream(menuItems)
//                .map(x -> new MenuItemRecord(x.getName(),
//                        x.getDescription(),
//                        x.isVegetarian(),
//                        x.getPrice())).toList();

//        Iterator<MenuComponent> iterator = allMenus.createIterator();
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        List<MenuItemRecord> records = new java.util.ArrayList<>();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            //Before adding, check if menuComponent is a MenuItem or Menu

            if (menuComponent instanceof MenuItem) {
                records.add(new MenuItemRecord(menuComponent.getName(),
                        menuComponent.getDescription(),
                        menuComponent.isVegetarian(),
                        menuComponent.getPrice()));
            }



            



//            records.add(new MenuItemRecord(menuComponent.getName(),
//                    menuComponent.getDescription(),
//                    menuComponent.isVegetarian(),
//                    menuComponent.getPrice()));

//            records = Arrays.asList(menuComponent.getItems()).stream()
//                    .map(x -> new MenuItemRecord(x.getName(),
//                            x.getDescription(),
//                            x.isVegetarian(),
//                            x.getPrice())).toList();
        }



        return records;
    }

    
}