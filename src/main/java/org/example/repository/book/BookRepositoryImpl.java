package org.example.repository.book;

import org.example.domain.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class BookRepositoryImpl implements ManageBookRepository, ReadBookRepository {

    @Override
    public boolean addBook(Book book) {
        List<Book> booksTmp = getBooks();
        return booksTmp.add(book);
    }

    @Override
    public boolean deleteBook(Long bookId) {
        Book bookToDelete = getBookById(bookId);
        return getBooks().remove(bookToDelete);
    }

    @Override
    @Cacheable("books")
    public List<Book> getBooks() {

        Book book1 = new Book("Harry Potter i Kamien Filozoficzny", "J.K.Rowling", 1, 1997);
        Book book2 = new Book("Nauka programowania. Rusz głową!", "Eric Freeman", 2, 2019);
        Book book3 = new Book("Java. Efektywne programowanie", "Joshua Bloch", 3, 2017);
        Book book4 = new Book("Rusz glowa! Java", "Kathy Sierra, Bert Bates", 4, 2010);
        Book book5 = new Book("SQL. Rusz głową!", "Lynn Beighley", 5, 2011);

        return Stream.of(book1, book2, book3, book4, book5).collect(Collectors.toList());
    }

    @Override
    public Book getBookById(Long bookId) {
        return getBooks().
                stream().
                filter(book -> book.getId() == bookId).
                findFirst()
                .get();
    }
}
