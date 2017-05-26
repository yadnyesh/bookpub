package org.test.bookpub.org.test.bookpub.entity;

import java.util.List;

/**
 * Created by z063407 on 5/26/17.
 */
public class Publisher {
    private Long id;

    private String name;

    private List<Book> books;

    protected Publisher() {};

    public Publisher(Long id, String name, List<Book> books) {
        this.id = id;
        this.name = name;
        this.books = books;
    }
}
