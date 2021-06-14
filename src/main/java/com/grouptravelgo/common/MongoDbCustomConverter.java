package com.grouptravelgo.common;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.stereotype.Component;

@Component
@ReadingConverter
public class MongoDbCustomConverter implements Converter<java.util.Date, java.sql.Date> {

	// @Override
	public java.sql.Date convert(java.util.Date source) {
		return new java.sql.Date(source.getTime());
	}

	@Bean
	public MongoCustomConversions customConversions() {
		List<Converter<?, ?>> converters = new ArrayList<>();
		converters.add(new MongoDbCustomConverter());
		return new MongoCustomConversions(converters);
	}
}
