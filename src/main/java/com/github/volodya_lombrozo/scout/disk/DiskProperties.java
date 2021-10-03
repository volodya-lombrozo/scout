package com.github.volodya_lombrozo.scout.disk;

import com.github.volodya_lombrozo.scout.Properties;
import com.github.volodya_lombrozo.scout.PropertiesArray;
import com.github.volodya_lombrozo.scout.Property;

import java.util.List;

public class DiskProperties implements Properties {

    private final PropertiesArray array;

    public DiskProperties() {
        this(new TotalSpace(), new FreeSpace(), new UsableSpace());
    }

    public DiskProperties(Property... properties) {
        this(new PropertiesArray(properties));
    }

    public DiskProperties(PropertiesArray properties) {
        this.array = properties;
    }

    @Override
    public List<Property> toList() {
        return array.toList();
    }
}
