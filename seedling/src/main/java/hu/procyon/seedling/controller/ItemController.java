package hu.procyon.seedling.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.Item;
import hu.procyon.seedling.model.Response;
import hu.procyon.seedling.model.Stats;

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
    public Response markItem(@PathVariable int itemId) {
        return new Response(true);
    }

    @PostMapping(path = "/unmark/{itemId}")
    public Response unmarkItem(@PathVariable int itemId) {
        return new Response(true);
    }

    @PostMapping(path = "/mark/")
    public Response markItems(@RequestParam("ids[]") List<String> ids) {
        return new Response(true);
    }

    @PostMapping(path = "/starr/{itemId}")
    public Response starItem(@PathVariable int itemId) {
        return new Response(true);
    }

    @PostMapping(path = "/unstarr/{itemId}")
    public Response unstarItem(@PathVariable int itemId) {
        return new Response(true);
    }

    @GetMapping(path = "/stats")
    public Stats getStats() {
        return new Stats();
    }
}