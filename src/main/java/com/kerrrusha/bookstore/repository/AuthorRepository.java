package com.kerrrusha.bookstore.repository;

import com.kerrrusha.bookstore.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {}
