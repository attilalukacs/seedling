package hu.procyon.seedling.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.Spout;

@RestController
public class SpoutController {

    @GetMapping("/spouts")
    public Map<String, Spout> getSpouts() {
        return Collections.emptyMap();
    }

}