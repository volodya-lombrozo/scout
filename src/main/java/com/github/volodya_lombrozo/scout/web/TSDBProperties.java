package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.Properties;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TSDBProperties {
    private final List<TSDBProperty> properties;

    public TSDBProperties(Properties properties) {
        this(properties.toList().stream()
                .map(TSDBProperty::new)
                .collect(Collectors.toList()));
    }

    public TSDBProperties(final List<TSDBProperty> properties) {
        this.properties = new ArrayList<>(properties);
    }

    public TSDBProperties withLabel(final Label label) {
        List<TSDBProperty> properties = this.properties.stream()
                .map(property -> property.withLabel(label))
                .collect(Collectors.toList());
        return new TSDBProperties(properties);
    }

    @Override
    public String toString() {
        return properties.stream()
                .map(TSDBProperty::toString)
                .collect(Collectors.joining("\n"));
    }
}
