package com.github.volodya_lombrozo.scout.prometheus;

import com.github.volodya_lombrozo.scout.AllPrefixed;
import com.github.volodya_lombrozo.scout.Scout;
import io.prometheus.client.CollectorRegistry;
import io.prometheus.client.exporter.PushGateway;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class PrometheusScout implements Scout {

    private final ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
    private final PushGateway pushGateway;
    private final String address;
    private final Logger logger = Logger.getLogger("Prometheus sender");

    public PrometheusScout() {
        this("scout.pushgateway:9091");
    }

    public PrometheusScout(final String address) {
        this.address = address;
        this.pushGateway = new PushGateway(address);
    }

    @Override
    public void pushMetrics() {
        executor.scheduleAtFixedRate(this::push, 0, 1, TimeUnit.SECONDS);
    }

    private void push() {
        try {
            AllPrefixed properties = new AllPrefixed();
            CollectorRegistry registry = new PrometheusRegistry(properties).toCollectorRegistry();
            pushGateway.pushAdd(registry, "push_application_properties");
        } catch (IOException e) {
            logger.info(String.format("Can't send properties to %s", address));
        }
    }

}
