package com.kerrrusha.bookstore.bootstrap;

import com.kerrrusha.bookstore.domain.Author;
import com.kerrrusha.bookstore.domain.Book;
import com.kerrrusha.bookstore.domain.Publisher;
import com.kerrrusha.bookstore.repository.AuthorRepository;
import com.kerrrusha.bookstore.repository.BookRepository;
import com.kerrrusha.bookstore.repository.PublisherRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {
        Author robert = new Author("Robert", "Martin");
        Book cleanCode = new Book("Clean Code", "123456");

        robert.addBook(cleanCode);
        cleanCode.addAuthor(robert);

        authorRepository.save(robert);
        bookRepository.save(cleanCode);

        Publisher megacorp = new Publisher("Megacorp", "13 Jakarta Ave, Albuquerque, NM");
        publisherRepository.save(megacorp);

        cleanCode.setPublisher(megacorp);
        megacorp.addBook(cleanCode);

        bookRepository.save(cleanCode);
        publisherRepository.save(megacorp);

        log.info("Started in Bootstrap");
        log.info("Authors count: {}", authorRepository.count());
        log.info("Books count: {}", bookRepository.count());
        log.info("Publishers count: {}", publisherRepository.count());
    }

}
