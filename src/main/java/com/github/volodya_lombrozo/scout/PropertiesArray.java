package com.github.volodya_lombrozo.scout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PropertiesArray implements Properties {

    private final List<Property> properties;

    public PropertiesArray(Property... properties) {
        this(Arrays.asList(properties));
    }

    public PropertiesArray(final List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public List<Property> toList() {
        return new ArrayList<>(properties);
    }
}
