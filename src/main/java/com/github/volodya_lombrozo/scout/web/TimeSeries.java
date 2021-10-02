package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.Property;

public class TimeSeries {

    private final Property property;

    public TimeSeries(final Property property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return String.format("%s{%s} %s", property.name(), "units=\"" + property.baseUnits() + "\"", property.value());
    }
}
