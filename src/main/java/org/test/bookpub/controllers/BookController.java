package org.test.bookpub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.test.bookpub.repository.BookRepository;

/**
 * Created by z063407 on 5/31/17.
 */
public class BookController {

    @Autowired
    private BookRepository bookRepository;
}
