package com.github.volodya_lombrozo.scout.disk;

import com.github.volodya_lombrozo.scout.Properties;
import com.github.volodya_lombrozo.scout.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiskProperties implements Properties {

    List<Property> properties;

    public DiskProperties() {
        this(new TotalSpace(), new FreeSpace(), new UsableSpace());
    }

    public DiskProperties(Property... properties) {
        this(Arrays.asList(properties));
    }

    public DiskProperties(final List<Property> properties) {
        this.properties = properties;
    }

    @Override
    public List<Property> toList() {
        return new ArrayList<>(properties);
    }
}
