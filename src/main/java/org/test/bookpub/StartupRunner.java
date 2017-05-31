package org.test.bookpub;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.test.bookpub.repository.BookRepository;

import javax.sql.DataSource;


public class StartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private DataSource ds;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("DataSource: "+ds.toString());
        //logger.info("Number of books: " + bookRepository.count());
    }

    @Scheduled(initialDelay = 1000, fixedDelay = 10000)
    public void run() {
        logger.info("Number of books: " + bookRepository.count());
    }

}