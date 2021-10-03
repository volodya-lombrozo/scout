package com.github.volodya_lombrozo.scout;

import com.github.volodya_lombrozo.scout.disk.DiskProperties;
import com.github.volodya_lombrozo.scout.instance.InstanceProperties;
import com.github.volodya_lombrozo.scout.memory.MemoryProperties;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class All implements Properties {

    private final List<Properties> properties;

    public All() {
        this(new DiskProperties(), new MemoryProperties(), new InstanceProperties());
    }

    public All(Properties... properties) {
        this(Arrays.asList(properties));
    }

    public All(final List<Properties> properties) {
        this.properties = properties;
    }

    @Override
    public List<Property> toList() {
        return properties.stream()
                .map(Properties::toList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
