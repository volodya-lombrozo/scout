package com.github.volodya_lombrozo.scout.instance;

import com.github.volodya_lombrozo.scout.Property;

public class NumberOfInstances implements Property {
    @Override
    public String name() {
        return "instance_number";
    }

    @Override
    public String value() {
        return String.valueOf(1);
    }

    @Override
    public String baseUnits() {
        return "Integer";
    }
}
