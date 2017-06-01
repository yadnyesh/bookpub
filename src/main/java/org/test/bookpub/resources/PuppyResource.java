package org.test.bookpub.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by z063407 on 6/1/17.
 */

@RestController
public class PuppyResource {

    @RequestMapping("/puppy")
    public String puppy() {
        return "This is an adorable puppy!";
    }
}
