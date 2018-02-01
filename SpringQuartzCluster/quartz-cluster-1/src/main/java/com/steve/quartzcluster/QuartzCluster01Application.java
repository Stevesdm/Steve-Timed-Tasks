package com.steve.quartzcluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:spring-quartz.xml")
public class QuartzCluster01Application {

	public static void main(String[] args) {
		SpringApplication.run(QuartzCluster01Application.class, args);
	}
}
