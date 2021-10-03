package com.github.volodya_lombrozo.scout.instance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HostNameTest {

    @Test
    void value() {
        HostName hostName = new HostName();

        String value = hostName.value();

        assertNotNull(value);
        assertFalse(value.isBlank());
    }
}