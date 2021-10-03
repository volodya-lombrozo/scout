package com.github.volodya_lombrozo.scout.prometheus;

import com.github.volodya_lombrozo.scout.Property;
import com.github.volodya_lombrozo.scout.instance.HostName;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.Gauge;

public class PropertyGauge {

    private final Property property;
    private final Property host = new HostName();

    public PropertyGauge(final Property property) {
        this.property = property;
    }

    public void register(CollectorRegistry registry) {
        try {
            Gauge gauge = Gauge.build()
                    .name(property.name())
                    .help("Application property")
                    .labelNames("host")
                    .register(registry);
            String hostname = host.value().replaceAll("[.,;'\\-+=*&^%$#@!]", "_");
            gauge.labels(hostname)
                    .set(Double.parseDouble(property.value()));
        } catch (NumberFormatException ignore) {
        }
    }
}
