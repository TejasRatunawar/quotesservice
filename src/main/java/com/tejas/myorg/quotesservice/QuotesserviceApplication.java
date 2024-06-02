package com.tejas.myorg.quotesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication/*(scanBasePackages={
		"com.tejas.myorg.quotesservice"})
@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})*/
//@EnableMongoRepositories

public class QuotesserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotesserviceApplication.class, args);
	}

}
