package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.DinerMenu;
import edu.iu.habahram.DinerPancakeHouseMerge.model.Iterator;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.PancakeHouseMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PancakeHouseRepository {
    public Iterator getTheMenuIterator() {
        return new PancakeHouseMenu().createIterator();
    }
}
