package com.github.volodya_lombrozo.scout.instance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPTest {

    @Test
    void value() {
        IP ip = new IP();

        String value = ip.value();

        assertNotNull(value);
        assertTrue(value.contains("."));
    }
}