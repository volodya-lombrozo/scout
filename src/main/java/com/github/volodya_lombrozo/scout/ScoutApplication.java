package com.github.volodya_lombrozo.scout;

import com.github.volodya_lombrozo.scout.prometheus.PrometheusScout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScoutApplication implements CommandLineRunner {

    private final Scout scout;

    @Autowired
    public ScoutApplication(@Value("${prometheus.server.host}") String prometheusHost) {
        scout = new PrometheusScout(prometheusHost);
    }

    public static void main(String[] args) {
        SpringApplication.run(ScoutApplication.class);
    }

    @Override
    public void run(final String... args) {
        scout.pushMetrics();
    }
}
