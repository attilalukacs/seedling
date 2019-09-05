package hu.procyon.seedling.model;

import java.util.Map;

/**
 * Spout
 */
public class Spout {

    private String id;
    private String name;
    private String description;
    private Map<String, SpoutParam> params;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, SpoutParam> getParams() {
        return params;
    }

    public void setParams(Map<String, SpoutParam> params) {
        this.params = params;
    }
}