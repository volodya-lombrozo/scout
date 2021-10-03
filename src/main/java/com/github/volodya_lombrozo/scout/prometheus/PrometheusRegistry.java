package com.github.volodya_lombrozo.scout.prometheus;

import com.github.volodya_lombrozo.scout.Properties;
import io.prometheus.client.CollectorRegistry;

public class PrometheusRegistry {

    private final CollectorRegistry registry;
    private final Properties properties;

    public PrometheusRegistry(final Properties properties) {
        this(new CollectorRegistry(), properties);
    }

    public PrometheusRegistry(final CollectorRegistry registry, final Properties properties) {
        this.registry = registry;
        this.properties = properties;
    }

    CollectorRegistry toCollectorRegistry() {
        properties.toList().stream().map(PropertyGauge::new)
                .forEach(prop -> prop.register(registry));
        return registry;
    }

}
