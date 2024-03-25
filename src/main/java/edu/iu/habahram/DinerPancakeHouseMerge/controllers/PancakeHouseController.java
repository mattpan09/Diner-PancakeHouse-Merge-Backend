package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;

@RestController
@CrossOrigin
@RequestMapping("/pancakehouse")
public class PancakeHouseController {
    PancakeHouseRepository repository;

    public PancakeHouseController(PancakeHouseRepository repository) {
        this.repository = repository;
    }

//    @GetMapping
//    public List<MenuItem> get() {
//        return repository.get;
//    }
    @GetMapping
    public Iterator<MenuItem> get() {
        return repository.getTheMenuIterator();
    }
}
