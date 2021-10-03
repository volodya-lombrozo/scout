package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.AllPrefixed;
import com.github.volodya_lombrozo.scout.ApplicationId;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    ApplicationId id = new ApplicationId();

    @GetMapping(value = "metrics", produces = "text/plain")
    public String metrics() {
        return new TSDBProperties(new AllPrefixed())
                .withLabel(new ApplicationLabel(id))
                .toString();
    }


}
