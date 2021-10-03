package com.github.volodya_lombrozo.scout.memory;

import com.github.volodya_lombrozo.scout.Properties;
import com.github.volodya_lombrozo.scout.PropertiesArray;
import com.github.volodya_lombrozo.scout.Property;

import java.util.List;

public class MemoryProperties implements Properties {

    private final PropertiesArray properties;

    public MemoryProperties() {
        this(new TotalMemory(), new FreeMemory());
    }

    public MemoryProperties(Property... properties) {
        this(new PropertiesArray(properties));
    }

    public MemoryProperties(final PropertiesArray properties) {
        this.properties = properties;
    }

    @Override
    public List<Property> toList() {
        return properties.toList();
    }
}
