package com.grouptravelgo.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

// @SpringBootApplication
@SpringBootApplication(scanBasePackages = { "com.grouptravelgo" })
@EnableMongoRepositories(basePackages = "com.grouptravelgo.dal.mongo")

public class GroupTravelGoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GroupTravelGoApplication.class, args);
	}

}
