package hu.procyon.seedling.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.procyon.seedling.model.Spout;
import hu.procyon.seedling.model.SpoutParam;

@RestController
public class SpoutController {

    @GetMapping("/spouts")
    public Map<String, Spout> getSpouts() {
        Map<String, Spout> result = new HashMap<>();
        Spout spout = new Spout();
        spout.setId("test");
        spout.setName("Test");
        spout.setDescription("Test.");
        SpoutParam param = new SpoutParam();
        param.setName("testparam");
        param.setRequired(true);
        param.setTitle("TestParam.");
        param.setType(SpoutParam.Type.TEXT);
        param.setValidation(Arrays.asList(SpoutParam.Validation.NOTEMPTY));
        Map<String, SpoutParam> params = new HashMap<>();
        params.put(param.getName(), param);
        spout.setParams(params);
        result.put(spout.getId(), spout);
        return result;
    }
}