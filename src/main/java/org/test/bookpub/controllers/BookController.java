package org.test.bookpub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.test.bookpub.Isbn;
import org.test.bookpub.org.test.bookpub.entity.Book;
import org.test.bookpub.org.test.bookpub.entity.Reviewer;
import org.test.bookpub.repository.BookRepository;

import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public Iterable<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(){
        return "Hello";
    }


//    @RequestMapping(value = "{isbn}", method = RequestMethod.GET)
//    public Book getBook(@PathVariable String isbn) {
//        return bookRepository.findBookByIsbn(isbn);
//    }


    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public Book getBook(@PathVariable Isbn isbn) {
        return bookRepository.findBookByIsbn(isbn.getIsbn());
    }

    @RequestMapping(value = "/{isbn}/reviewers", method = RequestMethod.GET)
    public List<Reviewer> getReviewers(@PathVariable("isbn") Book book) {
        return book.getReviewers();
    }
}
