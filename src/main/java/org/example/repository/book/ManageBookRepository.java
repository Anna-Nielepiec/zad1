package org.example.repository.book;

import org.example.domain.Book;

import java.util.List;

public interface ManageBookRepository {

    List<Book> getBooks();

    Book getBookById(Long bookId);

    boolean addBook(Book book);

    boolean deleteBook(Long bookId);
}
