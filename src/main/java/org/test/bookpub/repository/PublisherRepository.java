package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.org.test.bookpub.entity.Publisher;

/**
 * Created by z063407 on 5/31/17.
 */
//@RepositoryRestResource
public interface PublisherRepository extends PagingAndSortingRepository<Publisher, Long> {
}
