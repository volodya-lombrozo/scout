package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.Property;

public class UnitLabel extends Label {

    public UnitLabel(Property property) {
        this(property.baseUnits());
    }

    public UnitLabel(final String units) {
        super("units", units);
    }
}
