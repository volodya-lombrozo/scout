package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.Property;

public class JsonProperty {

    private final String name;
    private final String value;
    private final String baseUnit;

    public JsonProperty(Property property) {
        this(property.name(), property.value(), property.baseUnits());
    }

    public JsonProperty(final String name, final String value, final String baseUnit) {
        this.name = name;
        this.value = value;
        this.baseUnit = baseUnit;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public String getBaseUnit() {
        return baseUnit;
    }
}
