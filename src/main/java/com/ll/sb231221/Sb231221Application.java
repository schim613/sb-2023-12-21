package com.ll.sb231221;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Sb231221Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb231221Application.class, args);
    }
}
