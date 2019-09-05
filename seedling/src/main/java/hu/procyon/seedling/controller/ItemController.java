package hu.procyon.seedling.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.BasicResponse;
import hu.procyon.seedling.model.BasicStats;
import hu.procyon.seedling.model.Item;

@RestController
public class ItemController {

    private static Logger LOG = LoggerFactory.getLogger(ItemController.class);

    @GetMapping(path = "/items")
    public List<Item> getItems() {
        //TODO: introduce parameters according to specs
        return Arrays.asList(
            new Item()
        );
    }

    @PostMapping(path = "/mark/{itemId}")
    public BasicResponse markItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping(path = "/unmark/{itemId}")
    public BasicResponse unmarkItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping(path = "/mark/")
    public BasicResponse markItems(@RequestParam("ids[]") List<String> ids) {
        return new BasicResponse(true);
    }

    @PostMapping(path = "/starr/{itemId}")
    public BasicResponse starItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping(path = "/unstarr/{itemId}")
    public BasicResponse unstarItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @GetMapping(path = "/stats")
    public BasicStats getStats() {
        return new BasicStats();
    }
}