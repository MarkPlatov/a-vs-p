package com.mark.avsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AvsPApp {

    public static void main(String[] args) {
        SpringApplication.run(AvsPApp.class, args);
    }

}
