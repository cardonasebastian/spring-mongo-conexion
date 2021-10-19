package com.example.chnnmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ChnnMongoExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChnnMongoExampleApplication.class, args);
	}

}
