//package com.jjh.graphql.service;
//
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.sql.SQLException;
//import java.util.List;
//
//@Component
//public class BooksQueryResolver implements GraphQLQueryResolver {
//
//	private Bookshop bookshop;
//
//	@Autowired
//	public BooksQueryResolver(Bookshop bookshop) {
//		this.bookshop = bookshop;
//	}
//
//	public List<Book> getBooks(int count) throws SQLException {
//		System.out.println("Query.getBooks(" + count + ")");
//		return bookshop.getBooks(count);
//	}
//
//	public List<Book> getAll_books() throws SQLException {
//		System.out.println("Query.getAllBooks()");
//		return bookshop.getAllBooks();
//	}
//
//
////	@Configuration
////	public class AppConfig {
////		@Bean
////		public BookDAO BookDAO() {
////			return new BookDAO();
////		}
////	}
//
//}
