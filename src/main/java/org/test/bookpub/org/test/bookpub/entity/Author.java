package org.test.bookpub.org.test.bookpub.entity;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * Created by z063407 on 5/26/17.
 */
public class Author {

    private Long id;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

}
