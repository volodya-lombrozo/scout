package com.github.volodya_lombrozo.scout.memory;

import com.github.volodya_lombrozo.scout.Property;

public class FreeMemory implements Property {
    @Override
    public String name() {
        return "scout_memory_free";
    }

    @Override
    public String value() {
        long memory = Runtime.getRuntime().freeMemory();
        return String.valueOf(memory);
    }

    @Override
    public String baseUnits() {
        return "Bytes";
    }
}
