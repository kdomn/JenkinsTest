package com.jjh.graphql.service;

import com.jjh.graphql.service.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}

