package org.test.bookpub.org.test.bookpub.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by z063407 on 5/26/17.
 */
public class Reviewer {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    protected Reviewer() {}

    public Reviewer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
