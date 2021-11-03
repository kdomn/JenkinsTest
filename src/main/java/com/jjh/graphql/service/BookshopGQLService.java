package com.jjh.graphql.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.util.Collections;

@SpringBootApplication
public class BookshopGQLService extends SpringBootServletInitializer {

	public static void main(String[] args)  {
		System.out.println("Starting App setup");
		SpringApplication app = new SpringApplication(BookshopGQLService.class); app.setDefaultProperties(Collections.singletonMap("server.port", "1010")); app.run(args);
		System.out.println("Setup finished");
		System.out.println("\tAccess: http://localhost:1010/graphiql");
	}

}