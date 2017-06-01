package org.test.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.bookpub.org.test.bookpub.entity.Book;

/**
 * Created by z063407 on 5/30/17.
 */
//@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

    Book findBookByIsbn(String isbn);
}
