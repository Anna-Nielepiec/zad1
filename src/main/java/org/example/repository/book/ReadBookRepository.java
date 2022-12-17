package org.example.repository.book;

import org.example.domain.Book;

import java.util.List;

public interface ReadBookRepository {

    List<Book> getBooks();

    Book getBookById(Long bookId);
}
