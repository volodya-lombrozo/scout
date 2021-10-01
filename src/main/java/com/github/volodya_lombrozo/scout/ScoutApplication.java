package com.github.volodya_lombrozo.scout;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScoutApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(ScoutApplication.class);
    }

    @Override
    public void run(final String... args) {
        System.out.println("Hello world!");
    }
}
