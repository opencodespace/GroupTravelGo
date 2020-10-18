package com.grouptravelgo.httpsession;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.mongo.JdkMongoSessionConverter;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;

@EnableMongoHttpSession
public class HttpSessionConfig {

    @Bean
    public JdkMongoSessionConverter jdkMongoSessionConverter() {
    	System.out.println("==========> HttpSessionConfig.jdkMongoSessionConverter()");
    	return new JdkMongoSessionConverter(Duration.ofMinutes(30));
    }
	
}
