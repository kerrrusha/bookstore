package com.kerrrusha.bookstore.repository;

import com.kerrrusha.bookstore.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {}
