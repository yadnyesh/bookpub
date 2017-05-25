package org.test.bookpub.org.test.bookpub.entity;

import javax.persistence.*;

/**
 * Created by z063407 on 5/25/17.
 */

@Entity
public class Book {

        @Id
        @GeneratedValue
        private Long id;
        private String isbn;
        private String title;
        private String description;

        @ManyToOne
        private Author author;

        @ManyToOne
        private Publisher publisher;

        @ManyToMany
        private List<Reviewers> reviewers;

        protected Book() {}





}
