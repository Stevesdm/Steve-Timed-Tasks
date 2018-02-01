package com.steve.quartzcluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring-quartz.xml")
public class QuartzCluster2Application {

    public static void main(String[] args) {
        SpringApplication.run(QuartzCluster2Application.class, args);
    }
}
