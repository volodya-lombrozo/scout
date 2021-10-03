package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TSDBProperty {

    private final Property property;
    private final List<Label> labels;

    public TSDBProperty(final Property property) {
        this(property, new UnitLabel(property));
    }

    public TSDBProperty(final Property property, Label... labels) {
        this(property, Arrays.stream(labels).collect(Collectors.toList()));
    }

    public TSDBProperty(final Property property, List<Label> labels) {
        this.property = property;
        this.labels = labels;
    }

    public TSDBProperty withLabel(Label label) {
        ArrayList<Label> labels = new ArrayList<>(this.labels);
        labels.add(label);
        return new TSDBProperty(property, labels);
    }

    @Override
    public String toString() {
        String labelsList = labels.stream().map(Label::toString).collect(Collectors.joining(","));
        return String.format("%s{%s} %s", property.name(), labelsList, property.value());
    }
}
