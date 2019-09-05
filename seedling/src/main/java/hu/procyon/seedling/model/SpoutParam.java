package hu.procyon.seedling.model;

import java.util.List;

public class SpoutParam {
    private String name;
    private String title;
    private Type type;
    private Object defaultValue;
    private boolean required;
    private List<Validation> validation;

    public enum Type {
        TEXT;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

    public enum Validation {
        NOTEMPTY;

        @Override
        public String toString() {
            return name().toLowerCase();
        }
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public List<Validation> getValidation() {
        return validation;
    }

    public void setValidation(List<Validation> validation) {
        this.validation = validation;
    }
}
