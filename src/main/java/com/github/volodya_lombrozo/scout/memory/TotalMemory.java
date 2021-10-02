package com.github.volodya_lombrozo.scout.memory;

import com.github.volodya_lombrozo.scout.Property;

public class TotalMemory implements Property {
    @Override
    public String name() {
        return "memory_total";
    }

    @Override
    public String value() {
        long memory = Runtime.getRuntime().totalMemory();
        return String.valueOf(memory);
    }

    @Override
    public String baseUnits() {
        return "Bytes";
    }
}
