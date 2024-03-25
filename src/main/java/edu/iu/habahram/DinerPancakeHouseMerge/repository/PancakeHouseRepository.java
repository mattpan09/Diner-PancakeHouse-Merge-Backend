package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.Iterator;

@Repository
public class PancakeHouseRepository {
    public Iterator<MenuItem> getTheMenuIterator() {
        return (Iterator<MenuItem>) new PancakeHouseMenu().createIterator();
    }
}
