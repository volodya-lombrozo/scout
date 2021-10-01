package com.github.volodya_lombrozo.scout.web;

import com.github.volodya_lombrozo.scout.All;
import com.github.volodya_lombrozo.scout.Property;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
