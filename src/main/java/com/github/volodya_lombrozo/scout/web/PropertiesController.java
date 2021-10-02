package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.All;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PropertiesController {

    @GetMapping
    public List<JsonProperty> all() {
        return new All().toList()
                .stream().map(JsonProperty::new)
                .collect(Collectors.toList());
    }

    @GetMapping(value = "metrics", produces = "text/plain")
    public String metrics() {
        return new All().toList()
                .stream().map(TimeSeries::new)
                .map(TimeSeries::toString)
                .collect(Collectors.joining("\n"));
    }


}
