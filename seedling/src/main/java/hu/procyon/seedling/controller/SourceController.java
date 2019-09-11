package hu.procyon.seedling.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.BasicResponse;
import hu.procyon.seedling.model.ResponseWithId;
import hu.procyon.seedling.model.Source;
import hu.procyon.seedling.model.SourceStats;

@RestController
public class SourceController {

    @GetMapping("/sources/list")
    public List<Source> getSources() {
        Source source = new Source();
        source.setId(1);
        source.setTitle("Source Title");
        source.setTags(Arrays.asList("a", "bb"));
        source.setSpout("spout");
        Map<String, Object> params = new HashMap<>();
        params.put("key", "https://something");
        source.setParams(params);
        source.setError("error");
        source.setIcon("icon");
        return Arrays.asList(source);
    }

    @PostMapping("/source")
    public ResponseWithId addSource(@RequestParam String title,
                                    @RequestParam String spout,
                                    @RequestParam List<String> tags
                                    /* further unknown params */
                                    ) {

        int id = 1; //TODO
        return new ResponseWithId(true, id);
    }

    @PostMapping("/source/{sourceId}")
    public ResponseWithId updateSource(@PathVariable int sourceId,
                                       @RequestParam String title,
                                       @RequestParam String spout,
                                       @RequestParam List<String> tags
                                       ) {
        return new ResponseWithId(true, sourceId);
    }

    @DeleteMapping("/source/{sourceId}")
    public BasicResponse deleteSource(@PathVariable int sourceId) {
        return new BasicResponse(true);
    }

    @GetMapping("/sources/stats")
    public List<SourceStats> getSourceStats() {
        return Arrays.asList(
            new SourceStats()
        );
    }

}