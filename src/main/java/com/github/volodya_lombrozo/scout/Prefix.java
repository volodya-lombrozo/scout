package com.github.volodya_lombrozo.scout;

public class Prefix implements Property {

    private final String prefix;
    private final Property delegate;

    public Prefix(final Property delegate) {
        this("scout_", delegate);
    }

    public Prefix(final String prefix, final Property delegate) {
        this.prefix = prefix;
        this.delegate = delegate;
    }

    @Override
    public String name() {
        return String.format("%s_%s", prefix, delegate.name());
    }

    @Override
    public String value() {
        return delegate.value();
    }

    @Override
    public String baseUnits() {
        return delegate.baseUnits();
    }
}
