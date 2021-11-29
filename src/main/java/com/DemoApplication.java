package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    //@Override
    protected SpringApplicationBuilder springApplicationBuilder(SpringApplicationBuilder applicationBuilder){
        return applicationBuilder.sources(DemoApplication.class);

    }
}
