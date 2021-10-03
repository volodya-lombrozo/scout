package com.github.volodya_lombrozo.scout.web;

public class Label {

    private final String key;
    private final String value;

    public Label(final String key, final String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s=\"%s\"", key, value);
    }
}
