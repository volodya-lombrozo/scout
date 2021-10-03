package com.github.volodya_lombrozo.scout.instance;

import com.github.volodya_lombrozo.scout.Property;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IP implements Property {
    @Override
    public String name() {
        return "instance_ip";
    }

    @Override
    public String value() {
        try {
            return InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

    @Override
    public String baseUnits() {
        return "Custom";
    }
}
