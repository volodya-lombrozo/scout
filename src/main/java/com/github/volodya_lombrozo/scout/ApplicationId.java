package com.github.volodya_lombrozo.scout;

import java.util.Random;

public class ApplicationId {

    private final int id;

    public ApplicationId() {
        this(Math.abs(new Random().nextInt()));
    }

    public ApplicationId(final int id) {
        this.id = id;
    }

    public int intValue() {
        return id;
    }
}
