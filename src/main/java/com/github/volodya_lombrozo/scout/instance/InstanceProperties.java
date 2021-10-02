package com.github.volodya_lombrozo.scout.instance;

import com.github.volodya_lombrozo.scout.Properties;
import com.github.volodya_lombrozo.scout.PropertiesArray;
import com.github.volodya_lombrozo.scout.Property;

import java.util.List;

public class InstanceProperties implements Properties {

    private final PropertiesArray array;

    public InstanceProperties() {
        this(new NumberOfInstances());
    }

    public InstanceProperties(Property... properties) {
        this(new PropertiesArray(properties));
    }

    public InstanceProperties(final PropertiesArray array) {
        this.array = array;
    }

    @Override
    public List<Property> toList() {
        return array.toList();
    }
}
