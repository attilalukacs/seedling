package hu.procyon.seedling.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.BasicResponse;
import hu.procyon.seedling.model.Tag;

@RestController
public class TagController {

    @GetMapping("/tags")
    List<Tag> getTags() {
        Tag tag = new Tag();
        tag.setName("ez");
        tag.setColor("#800000");
        tag.setUnread(1);
        return Arrays.asList(
            tag
        );
    }

    @PostMapping("/tags/color")
    BasicResponse setTagColor(@RequestParam String tag, @RequestParam String color) {
        return new BasicResponse(true);
    }

}