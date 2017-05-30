package org.test.bookpub.org.test.bookpub.entity;

import javax.persistence.*;
import java.util.List;

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
        private List<Reviewer> reviewers;

        protected Book() {}

        public Book(String isbn, String title, Author author, Publisher publisher) {
                this.isbn = isbn;
                this.title = title;
                this.author = author;
                this.publisher = publisher;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getIsbn() {
                return isbn;
        }

        public void setIsbn(String isbn) {
                this.isbn = isbn;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public Author getAuthor() {
                return author;
        }

        public void setAuthor(Author author) {
                this.author = author;
        }

        public Publisher getPublisher() {
                return publisher;
        }

        public void setPublisher(Publisher publisher) {
                this.publisher = publisher;
        }

        public List<Reviewer> getReviewers() {
                return reviewers;
        }

        public void setReviewers(List<Reviewer> reviewers) {
                this.reviewers = reviewers;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Book book = (Book) o;

                if (id != null ? !id.equals(book.id) : book.id != null) return false;
                if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
                if (title != null ? !title.equals(book.title) : book.title != null) return false;
                if (description != null ? !description.equals(book.description) : book.description != null)
                        return false;
                if (author != null ? !author.equals(book.author) : book.author != null) return false;
                if (publisher != null ? !publisher.equals(book.publisher) : book.publisher != null) return false;
                return reviewers != null ? reviewers.equals(book.reviewers) : book.reviewers == null;
        }

        @Override
        public int hashCode() {
                int result = id != null ? id.hashCode() : 0;
                result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
                result = 31 * result + (title != null ? title.hashCode() : 0);
                result = 31 * result + (description != null ? description.hashCode() : 0);
                result = 31 * result + (author != null ? author.hashCode() : 0);
                result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
                result = 31 * result + (reviewers != null ? reviewers.hashCode() : 0);
                return result;
        }

        @Override
        public String toString() {
                return "Book{" +
                        "id=" + id +
                        ", isbn='" + isbn + '\'' +
                        ", title='" + title + '\'' +
                        ", description='" + description + '\'' +
                        ", author=" + author +
                        ", publisher=" + publisher +
                        ", reviewers=" + reviewers +
                        '}';
        }
}
