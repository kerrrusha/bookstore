package com.kerrrusha.bookstore.repository;

import com.kerrrusha.bookstore.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {}
