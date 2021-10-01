package com.github.volodya_lombrozo.scout.disk;

import com.github.volodya_lombrozo.scout.Property;

import java.nio.file.Path;

public class UsableSpace implements Property {

    @Override
    public String name() {
        return "scout_disc_usable";
    }

    @Override
    public String value() {
        return String.valueOf(Path.of(".").toFile().getUsableSpace());
    }

    @Override
    public String baseUnits() {
        return "Bytes";
    }
}
