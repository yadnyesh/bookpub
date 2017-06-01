package org.test.bookpub.formatters;

import org.springframework.format.Formatter;
import org.test.bookpub.org.test.bookpub.entity.Book;
import org.test.bookpub.repository.BookRepository;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by z063407 on 6/1/17.
 */
public class BookFormatter implements Formatter<Book>{

    private BookRepository  repository;

    public BookFormatter (BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Book parse(String bookIdentifier, Locale locale) throws ParseException {
        Book book = repository.findBookByIsbn(bookIdentifier);
        return book;//book != null ? book : repository.findOne(Long.valueOf(bookIdentifier));
    }

    @Override
    public String print(Book book, Locale locale) {
        return book.getIsbn();
    }


}
