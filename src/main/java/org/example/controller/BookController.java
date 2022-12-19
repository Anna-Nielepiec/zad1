package org.example.controller;

import org.example.domain.Book;
import org.example.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController("/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBooks(@PathVariable Long bookId) {
        return bookService.getBookById(bookId);
    }

    @PostMapping
    public boolean postBooks(@ModelAttribute Book book) {
        return bookService.addBook(book);
    }

    @DeleteMapping("/{bookId}")
    public boolean deleteBooks(@PathVariable Long bookId) {
        return bookService.deleteBook(bookId);
    }


    @PutMapping
    public boolean putBooks() {
        return true;
    }

    private java.util.List<Book> toList(Book... books) {
        return java.util.List.of(books);
    }

    private java.util.List<Book> toList(Book gr1, Book gr2, Book gr3, Book gr4) {
        java.util.List<Book> books = new ArrayList();
        books.add(gr1);
        books.add(gr2);
        books.add(gr3);
        books.add(gr4);
        return books;
    }
}
