package hu.procyon.seedling.controller;

import java.time.LocalDateTime;
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

    @GetMapping("/items")
    public List<Item> getItems() {
        //TODO: introduce parameters according to specs

        Item item = new Item();
        item.setId(1);
        item.setDatetime(LocalDateTime.now());
        item.setTitle("title");
        item.setContent("content");
        item.setSource("1");
        item.setUnread(false);
        item.setStarred(true);
        //item.setThumbnail("whatever.png");
        item.setThumbnail("");
        //item.setIcon("icon.gif");
        item.setIcon("");
        item.setUid("uid");
        item.setLink("http://link");
        item.setSourcetitle("sourceTitle");
        item.setTags(Arrays.asList("ilyen", "olyan"));
        return Arrays.asList(
            item
        );
    }

    @PostMapping("/mark/{itemId}")
    public BasicResponse markItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping("/unmark/{itemId}")
    public BasicResponse unmarkItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping("/mark/")
    public BasicResponse markItems(@RequestParam("ids[]") List<String> ids) {
        return new BasicResponse(true);
    }

    @PostMapping("/starr/{itemId}")
    public BasicResponse starItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @PostMapping("/unstarr/{itemId}")
    public BasicResponse unstarItem(@PathVariable int itemId) {
        return new BasicResponse(true);
    }

    @GetMapping("/stats")
    public BasicStats getStats() {
        return new BasicStats();
    }
}