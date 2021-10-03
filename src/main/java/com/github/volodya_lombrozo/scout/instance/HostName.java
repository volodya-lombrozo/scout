package com.github.volodya_lombrozo.scout.instance;

import com.github.volodya_lombrozo.scout.Property;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostName implements Property {

    @Override
    public String name() {
        return "instance_name";
    }

    @Override
    public String value() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            return "Unknown";
        }
    }

    @Override
    public String baseUnits() {
        return "Custom";
    }
}
