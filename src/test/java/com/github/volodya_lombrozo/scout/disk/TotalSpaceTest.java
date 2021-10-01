package com.github.volodya_lombrozo.scout.disk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalSpaceTest {

    @Test
    public void property() {
        TotalSpace totalSpace = new TotalSpace();
        String value = totalSpace.value();
        Long intValue = Long.valueOf(value);
        assertNotEquals(0, intValue);
        assertEquals("Bytes", totalSpace.baseUnits());
        assertFalse(totalSpace.name().isEmpty());
    }

}