package com.github.volodya_lombrozo.scout.disk;

import com.github.volodya_lombrozo.scout.Property;

import java.nio.file.Path;

public class TotalSpace implements Property {

    private final String key;
    private final String measurement;

    public TotalSpace() {
        this("disc_total", "Bytes");
    }

    public TotalSpace(final String key, final String measurement) {
        this.key = key;
        this.measurement = measurement;
    }

    @Override
    public String value() {
        return String.valueOf(Path.of(".").toFile().getTotalSpace());
    }

    @Override
    public String name() {
        return key;
    }

    @Override
    public String baseUnits() {
        return measurement;
    }

}
