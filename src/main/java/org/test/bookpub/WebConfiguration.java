package org.test.bookpub;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.test.bookpub.formatters.BookFormatter;
import org.test.bookpub.org.test.bookpub.entity.Book;
import org.test.bookpub.org.test.bookpub.entity.Reviewer;
import org.test.bookpub.repository.BookRepository;

import java.util.Formatter;
import java.util.List;

/**
 * Created by z063407 on 6/1/17.
 */
@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{

    @Autowired
    BookRepository bookRepository;

    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        return new LocaleChangeInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

    @Bean
    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter() {
        return new ByteArrayHttpMessageConverter();
    }

    @Override
    public void addFormatters(FormatterRegistry registry){
        registry.addFormatter(new BookFormatter(bookRepository));
    }

}
