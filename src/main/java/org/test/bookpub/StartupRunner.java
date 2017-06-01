package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.org.test.bookpub.entity.Author;
import org.test.bookpub.org.test.bookpub.entity.Book;
import org.test.bookpub.org.test.bookpub.entity.Publisher;
import org.test.bookpub.repository.AuthorRepository;
import org.test.bookpub.repository.BookRepository;
import org.test.bookpub.repository.PublisherRepository;

import javax.sql.DataSource;


public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
    }


    public void run() {
        logger.info("Number of books: " + bookRepository.count());
        Author author = new Author("Alex", "Antonov");
        author = authorRepository.save(author);
        Publisher publisher = new Publisher("Packt");
        publisher = publisherRepository.save(publisher);
        Book book = new Book("978-1-78528-415-1", "Spring Boot Recipes", author, publisher);
        bookRepository.save(book);
    }

}