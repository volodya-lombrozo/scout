package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.ApplicationId;

public class ApplicationLabel extends Label {

    public ApplicationLabel(ApplicationId applicationId) {
        this(String.valueOf(applicationId.intValue()));
    }

    public ApplicationLabel(final String value) {
        super("application", value);
    }
}
