package com.github.volodya_lombrozo.scout;

import java.util.List;
import java.util.stream.Collectors;

public class AllPrefixed implements Properties {

    private final All all;

    public AllPrefixed() {
        this(new All());
    }

    public AllPrefixed(final All all) {
        this.all = all;
    }

    @Override
    public List<Property> toList() {
        return all.toList()
                .stream().map(Prefix::new)
                .collect(Collectors.toList());
    }
}
