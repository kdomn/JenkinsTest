package com.jjh.graphql.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.ConfigurableApplicationContext;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Optional;

@SpringBootApplication
public class BookshopApp {

	public static void main(String [] args) throws SQLException {


		ConfigurableApplicationContext context = SpringApplication.run(BookshopApp.class, args);
		BookRepository bookshop = context.getBean(BookRepository.class);



		Optional<Book> optionalBook = bookshop.findById(2);
		System.out.println(optionalBook);
		Book b2 = new Book(19, "Java For YMLL", "YML", "John YMl");
		bookshop.save(b2);
		Book b3 = new Book(24, "Testy testy", "WHATTT", "AIAIAIAIA");
		bookshop.save(b3);
		bookshop.delete(b3);
		System.out.println(bookshop.findAll());


	}
}

