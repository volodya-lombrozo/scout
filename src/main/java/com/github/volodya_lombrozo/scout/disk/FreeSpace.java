package com.github.volodya_lombrozo.scout.disk;

import com.github.volodya_lombrozo.scout.Property;

import java.nio.file.Path;

public class FreeSpace implements Property {

    private final String name;
    private final String baseUnit;

    public FreeSpace() {
        this("disc_free", "Bytes");
    }

    public FreeSpace(final String name, final String measurement) {
        this.name = name;
        this.baseUnit = measurement;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String value() {
        return String.valueOf(Path.of(".").toFile().getFreeSpace());
    }

    @Override
    public String baseUnits() {
        return baseUnit;
    }
}
