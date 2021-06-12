package com.grouptravelgo.configuration;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

//Spring store type set in application.properties.
//spring.session.store-type=mongodb

@EnableMongoHttpSession
public class MongoSessionConfig {
	
    @Bean
    public JdkMongoSessionConverter jdkMongoSessionConverter() {
    	System.out.println("==========> MongoSessionConfig.jdkMongoSessionConverter()");
    	return new JdkMongoSessionConverter(Duration.ofMinutes(30));
    }
}
