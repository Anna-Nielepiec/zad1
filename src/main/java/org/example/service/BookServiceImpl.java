package org.example.service;

import org.example.domain.Book;
import org.example.repository.book.ManageBookRepository;
import org.example.repository.database.DatabaseConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class BookServiceImpl {

    @Autowired
    private ManageBookRepository bookRepository;

    @Autowired
    @Qualifier("mySqlDatabaseConnection")
    private DatabaseConnection connectionService;

    public List<Book> getBooks() {
        return bookRepository.getBooks();
    }

    public Book getBookById(Long bookId) {
        //return bookRepository.getBookById(bookId);
        return getBooks()
                .stream()
                .filter(book -> book.getId() == bookId)
                .findFirst()
                .get();
    }

    public boolean addBook(Book book) {
        //return bookRepository.addBook(book);
        return bookRepository.getBooks().add(book);
    }

    public boolean deleteBook(Long bookId) {
        //return bookRepository.deleteBook(bookId);
        Book bookToDelete = getBookById(bookId);
        return bookRepository.getBooks().remove(bookToDelete);
    }

    public List<Book> connectDatabase() {
//        DefaultDatabaseConnection object = new DefaultDatabaseConnection();
//
//        Object connection = connectionService.establishConnection();
//        List<Object> books =  connection.executeSelectStatement("");
//        connectionService.closeConnection(connection);
//        return books;
        return null;
    }
}
