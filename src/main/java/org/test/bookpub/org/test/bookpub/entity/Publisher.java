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

    public Publisher(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
