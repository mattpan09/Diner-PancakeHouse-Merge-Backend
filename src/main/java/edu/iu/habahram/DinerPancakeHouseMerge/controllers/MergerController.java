package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.Menu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.CafeRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergeRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {
//    DinerRepository dinerRepository;
//    PancakeHouseRepository pancakeHouseRepository;
//    CafeRepository cafeRepository;
    MergeRepository mergeRepository;

    public MergerController(MergeRepository mergeRepository) {
//        this.dinerRepository = dinerRepository;
//        this.pancakeHouseRepository = pancakeHouseRepository;
//        this.cafeRepository = cafeRepository;
        this.mergeRepository = mergeRepository;

    }

    @GetMapping
    public List<MenuItem> get() {
//        List<MenuItem> menuItems = new ArrayList<>();
//        Iterator<MenuItem> lunchItems = dinerRepository.getTheMenuIterator();
//        while (lunchItems.hasNext()) {
//            menuItems.add(lunchItems.next());
//        }
//
//        Iterator<MenuItem> breakfastItems = pancakeHouseRepository.getTheMenuIterator();
//        while (breakfastItems.hasNext()) {
//            menuItems.add(breakfastItems.next());
//        }
//
//        Iterator<MenuItem> cafeItems = cafeRepository.getTheMenuIterator();
//        while (cafeItems.hasNext()) {
//            menuItems.add(cafeItems.next());
//        }

        List<MenuItem> menuItems = new ArrayList<>();
        Iterator<Menu> menuIterator = mergeRepository.getTheMenus().iterator();
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            Iterator<MenuItem> iterator = menu.createIterator();
            while (iterator.hasNext()) {
                MenuItem menuItem = iterator.next();
                menuItems.add(menuItem);
            }
        }
        return menuItems;
    }
}
