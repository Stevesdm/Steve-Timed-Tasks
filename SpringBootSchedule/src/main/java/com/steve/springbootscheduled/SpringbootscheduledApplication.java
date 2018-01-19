package com.steve.springbootscheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringbootscheduledApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootscheduledApplication.class, args);
	}
}
