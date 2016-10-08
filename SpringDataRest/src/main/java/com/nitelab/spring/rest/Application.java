package com.nitelab.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by dph on 08/10/16.
 * Link:
 * https://spring.io/guides/gs/accessing-data-rest/
 */
@SpringBootApplication
@EntityScan(basePackages = "com.nitelab.spring.rest.model")
@EnableJpaRepositories(basePackages = "com.nitelab.spring.rest.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
